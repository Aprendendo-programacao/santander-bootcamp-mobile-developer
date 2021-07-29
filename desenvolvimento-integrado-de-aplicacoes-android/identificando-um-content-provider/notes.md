# Identificando um Content Provider

### Iniciando a implementação de um Content Provider

* Sempre criar uma constante chamada **AUTHORITY** (`const val AUTHORITY = <URI Authorities>`)

  > Para obter o `URI Authorities`: `AndroidManifest.xml` > TAG `provider` > Atributo `android:authorities`

  * **Função da constante `AUTHORITY`**: toda a requisição feita para o endereço do Content Provider, o chamará

  * **Exemplo**

    ```kotlin
    companion object {
        const val AUTHORITY = "me.gabreuw.content_provider.provider"
    }
    ```

* **Boa prática**: colocar o `onCreate` no topo, pois esse método é o responsável por inicializar o *Content Provider*

* Definir os retornos dos "endpoints" do *Content Provider*

  ```kotlin
  companion object {
      const val AUTHORITY = "me.gabreuw.content_provider.provider"

      const val NOTES = 1 // endpoint "notes" = retornar todas as anotações salvas
      const val NOTES_BY_ID = 2 // endpoint "notes/#" = retornar a notação com determinado ID
  }
  ```

  > **OBS**: os números (`1, 2`) atribuído a cada constante serve para indicar o resultado de cada operação, ou seja, o *Content Provider* ao receber uma requisição para "NOTES" então como retorno **SEMPRE** deverá ser 1

* `UriMatcher`

  * **Função**: objeto responsável pela validação das URLs de requisição do *Content Provider*

  * **Exemplo**

    ```kotlin
    private lateinit var mUriMatcher: UriMatcher

    override fun onCreate(): Boolean {
      mUriMatcher = UriMatcher(UriMatcher.NO_MATCH)
    }
    ```

* Registrar os "endpoints" do *Content Provider* no validador de URLs (`UriMatcher`)

  ```kotlin
  override fun onCreate(): Boolean {
      mUriMatcher = UriMatcher(UriMatcher.NO_MATCH)

      mUriMatcher.addURI(AUTHORITY, "notes", NOTES)
      mUriMatcher.addURI(AUTHORITY, "notes/#", NOTES_BY_ID)

      return true
  }
  ```

* Definir a URI base/endpoints, do *Content Provider*, para outras aplicações fazerem as requisições para ele

  ```kotlin
  companion object {
      const val AUTHORITY = "me.gabreuw.content_provider.provider"

      const val NOTES = 1
      const val NOTES_BY_ID = 2

      val BASE_URI = Uri.parse("content://$AUTHORITY") // content://me.gabreuw.content_provider.provider
      val URI_NOTES = Uri.withAppendedPath(BASE_URI, "notes") // content://me.gabreuw.content_provider.provider/notes
  }
  ```

* Banco de dados SQLite

  * Criar classe "Database Helper"

    ```kotlin
    class NotesDatabaseHelper(
        context: Context
    ) : SQLiteOpenHelper(context, "databaseNotes", null, 1) {

        override fun onCreate(db: SQLiteDatabase?) {}

        override fun onUpgrade(p0: SQLiteDatabase?, p1: Int, p2: Int) {}

    }
    ```

  * Definir as configurações da tabela (nome e coluna(s))

    ```kotlin
    class NotesDatabaseHelper(
        context: Context
    ) : SQLiteOpenHelper(context, "databaseNotes", null, 1) {

        override fun onCreate(db: SQLiteDatabase?) {}

        override fun onUpgrade(p0: SQLiteDatabase?, p1: Int, p2: Int) {}

        companion object {
            const val TABLE_NAME = "Notes"
            const val COLUMN_TITLE = "title"
            const val COLUMN_DESCRIPTION = "description"
        }

    }
    ```

    > Padrão de nomenclatura de tabelas e colunas no SQLite: o nome da **tabela com a 1º letra maiúsculo** e o nome da **coluna tudo em minúsculo**

  * Query para criar a tabela "Notes"

    ```kotlin
    class NotesDatabaseHelper(
        context: Context
    ) : SQLiteOpenHelper(context, "databaseNotes", null, 1) {

        override fun onCreate(db: SQLiteDatabase?) {
            db?.execSQL(
                "CREATE TABLE $TABLE_NAME (" +
                        "$_ID INTEGER NOT NULL PRIMARY KEY, " +
                        "$COLUMN_TITLE TEXT NOT NULL, " +
                        "$COLUMN_DESCRIPTION TEXT NOT NULL)"
            )
        }

        override fun onUpgrade(p0: SQLiteDatabase?, p1: Int, p2: Int) {}

        companion object {
            const val TABLE_NAME = "Notes"
            const val COLUMN_TITLE = "title"
            const val COLUMN_DESCRIPTION = "description"
        }

    }
    ```

  * Instanciar a classe Helper no *Content Provider*

    ```kotlin
    private lateinit var dbHelper: NotesDatabaseHelper

    override fun onCreate(): Boolean {
        mUriMatcher = UriMatcher(UriMatcher.NO_MATCH)

        mUriMatcher.addURI(AUTHORITY, "notes", NOTES)
        mUriMatcher.addURI(AUTHORITY, "notes/#", NOTES_BY_ID)

        if (context != null) {
            dbHelper = NotesDatabaseHelper(context as Context)
        }

        return true
    }
    ```

  * Implementar o método `delete`

    ```kotlin
    override fun delete(uri: Uri, selection: String?, selectionArgs: Array<String>?): Int {
        if (mUriMatcher.match(uri) != NOTES_BY_ID) {
            throw UnsupportedOperationException("UIR inválida para exclusão!")
        }

        val db: SQLiteDatabase = dbHelper.writableDatabase
        val affectedLines = db.delete(TABLE_NAME, "$_ID = ?", arrayOf(uri.lastPathSegment))

        db.close()

        context?.contentResolver?.notifyChange(uri, null) // IMPORTANTE: sempre notificar o Context após qualquer ação no Content Provider

        return affectedLines
    }
    ``` 

  * Implementar o método `getType` (Nesse projeto não terá suporte a arquivos, apenas dados)

    ```kotlin
    override fun getType(uri: Uri): String? =
        throw UnsupportedOperationException("Uri não implementado!")
    ```

  * Implementar o método `insert`

    ```kotlin
    override fun insert(uri: Uri, values: ContentValues?): Uri? {
        if (mUriMatcher.match(uri) != NOTES) {
            throw UnsupportedOperationException("Uri inválida para inserção!")
        }

        val db: SQLiteDatabase = dbHelper.writableDatabase

        val id = db.insert(TABLE_NAME, null, values)
        val insertUri: Uri = Uri.withAppendedPath(BASE_URI, id.toString())

        db.close()

        context?.contentResolver?.notifyChange(uri, null)

        return insertUri
    }
    ```

  * Implementar o método `query`

    ```kotlin
    override fun query(
        uri: Uri, 
        projection: Array<String>?, 
        selection: String?,
        selectionArgs: Array<String>?, 
        sortOrder: String?
    ): Cursor? {
        return when {
            mUriMatcher.match(uri) == NOTES -> {
                val db: SQLiteDatabase = dbHelper.writableDatabase

                val cursor: Cursor = db.query(
                    TABLE_NAME,
                    projection,
                    selection,
                    selectionArgs,
                    null,
                    null,
                    sortOrder
                )
                cursor.setNotificationUri(context?.contentResolver, uri)

                db.close()

                cursor
            }

            mUriMatcher.match(uri) == NOTES_BY_ID -> {
                val db: SQLiteDatabase = dbHelper.writableDatabase

                val cursor: Cursor = db.query(
                    TABLE_NAME,
                    projection,
                    "$_ID = ?",
                    arrayOf(uri.lastPathSegment),
                    null,
                    null,
                    sortOrder
                )
                cursor.setNotificationUri(context?.contentResolver, uri)

                db.close()

                cursor
            }

            else -> throw UnsupportedOperationException("URI não implementada!")
        }
    }
    ```

  * Implementar o método `update`

    ```kotlin
    override fun update(
        uri: Uri, values: ContentValues?, selection: String?,
        selectionArgs: Array<String>?
    ): Int {
        if (mUriMatcher.match(uri) != NOTES_BY_ID) {
            throw UnsupportedOperationException("URI não implementada!")
        }

        val db: SQLiteDatabase = dbHelper.writableDatabase
        val affectedLines = db.update(TABLE_NAME, values, "$_ID = ?", arrayOf(uri.lastPathSegment))
        
        db.close()
        
        context?.contentResolver?.notifyChange(uri, null)
        
        return affectedLines
    }
    ```