# Funções single-line e Funções/extensões

### Funções _single-line_

* **Sintaxe**

  ```kotlin
  fun nomeDaFunção(nome: Tipo) = expressão
  ```

* **Características**

  * Função de uma única linha

  * Inferência do tipo de retorno

* **Exemplos**

  ```kotlin
  private fun getFullName(firstName: String, lastName: String) = "$firstName $lastName"
  ```

### Funções extensões

* **Sintaxe**

  ```kotlin
  fun Tipo.nomeDaFunção() {
    // Corpo da função
  }
  ```

* **Características**

  * Criar uma função que só pode ser chamada por um tipo específico

  * Para referênciar o valor dentro da função, usa-se a palavra reservada `this` 

* **Exemplo**

  ```kotlin
  fun String.randomCapitalizedLetter() =
    this[(0..this.length - 1).random()].toUpperCase()
  ```