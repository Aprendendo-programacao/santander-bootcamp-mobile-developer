# Criando o CoordinatorLayout

### Loader Manager

* **Função**: Buscar o cursor em segundo plano (não afeta a UI Thread)

* **Implementação do *LoaderManager***

  ```kotlin
  class MainActivity : AppCompatActivity(), LoaderManager.LoaderCallbacks<Cursor> {
      override fun onCreate(savedInstanceState: Bundle?) {
          super.onCreate(savedInstanceState)
          setContentView(R.layout.activity_main)
      }
  }
  ```

* **Métodos gerados automaticamente**

  * `onCreateLoader`

    * **Função**: iniciar a pesquisa, em segundo plano, do *LoadManager*

    * **Exemplo**

      ```kotlin
      override fun onCreateLoader(id: Int, args: Bundle?): Loader<Cursor> {
          TODO("Not yet implemented")
      }
      ```

  * `onLoadFinished`

    * **Função**: manipular dados de pesquisa do *LoadManager*

    * **Exemplo**

      ```kotlin
      override fun onLoadFinished(loader: Loader<Cursor>, data: Cursor?) {
          TODO("Not yet implemented")
      }
      ```

  * `onLoaderReset`

    * **Função**: finalizar a pesquisa, em segundo plano, do *LoadManager*

    * **Exemplo**

      ```kotlin
      override fun onLoaderReset(loader: Loader<Cursor>) {
          TODO("Not yet implemented")
      }
      ```