# Introdução a funções

* **Sintaxe**

  * Para declarar uma função é necessário usar a palavra reservada `fun`

  ```kotlin
  fun nomeDaFunção(nome: Tipo): TipoRetorno {
    // Corpo da função
  }
  ```

  > _Unit_ (**void**) = basta omitir o tipo de retorno

* **Alguns tipos de funções**

  * Anônimas 
  * _Single-line_
  * _Inline_
  * Extensões
  * Lambdas
  * Ordem superior

* **Exemplos**

  ```kotlin
  private fun getFullName(firstName: String, lastName: String): String {
    val fullName = "$firstNme $lastName"
    
    return fullName
  }
  ```

  ```kotlin
  private fun getFullName(firstName: String, lastName: String): String {
    return "$firstNme $lastName"
  }
  ```

  ```kotlin
  private fun getFullName(firstName: String, lastName: String): String = "$firstNme $lastName"
  ```

  > **Apenas** na função _single-line_, o tipo de retorno pode ser omitido (inferência de tipos) 