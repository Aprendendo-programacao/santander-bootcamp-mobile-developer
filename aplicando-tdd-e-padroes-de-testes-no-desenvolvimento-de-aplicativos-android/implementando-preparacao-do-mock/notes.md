# Implementando preparação do mock

### Problema

* Utilização do *SharedPreferences*, do Android, necessita do contexto da aplicação

### Solução

* ***robolectric***: disponibiliza o recurso de *SharedPreferences* do Android

* **Código**

  ```kotlin
  @RunWith(RobolectricTestRunner::class)
  class ContactHelperTest {

    // Instanciação do "SharedPreferences"
    private val context = ApplicationProvider.getApplicationContext<Context>()
    private val sharedPreferences = context.getSharedPreferences(
      <pacote com as preferências>,
      <definição de acesso das preferências>
    )
    // Instanciação do "ContactHelper"
    private val contactHelper = ContactHelper(sharedPreferences)

    @Test
    fun `quando chamar o metodo getListContacts deve retornar 2 contatos`() {
      // Preparação
      mockListContacts()

      // Validação
      val list = contactHelper.getListContacts()
      assertEquals(
        2, // Valor esperado
        list.size // Valor atual
      )
    }

    // Método "mock" (criação de uma lista "fake")
    private fun mockListContacts() {
      contactHelper.setListContacts(
        arrayListOf(
          Contact(
            "Igor Ferrari",
            "(99) 9999-9999",
            "img.png"
          ),
          Contact(
            "José Alves",
            "(11) 1111-1111",
            "img.png"
          )
        )
      )
    }

    @Test
    fun `quando chamar o metodo getListContact sem contatos deve retornar uma lista vazia`() {
      // Preparação
      mockEmptyContactList()

      // Validação
      val list = contactHelper.getListContacts()
      assertEquals(0, list.size)
    }

    private fun mockEmptyContactList() {
      contactHelper.setListContacts(arrayListOf())
    }
  }
  ```

### Robolectric

* Framework para testes

* Permite a execução de teste com dependência de recursos do sistema operacional dentro da JVM

* **Dependências**:

  ```gradle
  testImplementation 'org.robolectric:robolectric:4.4'
  testImplementation 'androidx.test:core:1.3.0'
  ```