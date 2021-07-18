# Desenvolvimento com mapOf

### mapOf

* **Características**

  * Aceita apenas 1 tipo de valor

  * Tamanho fixo

  * Elementos imutáveis

  * Índice sempre começa em 0

  * Existem 2 formas de instanciar um elemento em um *map*: `Pair` ou [infix notation](https://kotlinlang.org/docs/functions.html#infix-notation)

* **Exemplo**

  ```kotlin
  val joao: Pair<String, Double> = Pair("João", 1000.0)
  val maria: Pair<String, Double> = Pair("Maria", 2000.0)
  val mapa = mapOf(joao, maria)

  mapa.forEach { (key, value) -> println("Chave: $key - Valor: $value") }

  // Saída
  // Chave: João - Valor: 1000.0
  // Chave: Maria - Valor: 2000.0
  ```

  ```kotlin
  val mapa = mapOf(
    "Pedro" to 2000.0,
    "Maria" to 3000.0,
  )

  mapa.forEach { (key, value) -> println("Chave: $key - Valor: $value") }

  // Saída
  // Chave: Pedro - Valor: 2000.0
  // Chave: Maria - Valor: 3000.0
  ```