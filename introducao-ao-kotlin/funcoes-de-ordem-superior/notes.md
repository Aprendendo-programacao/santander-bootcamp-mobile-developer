# Funções de ordem superior

* **Características**

  * **Recebem outra função ou lambda como parâmetro**

  * Bastante úteis para a generalização de funções e tratamento de erros

* **Exemplos**

  ```kotlin
  val x = calculate(12, 4, ::sum)
  ```

  ```kotlin
  val x = calculate(12, 4) {a, b -> a + b}
  ```

  ```kotlin
  fun sum(a: Int, b: Int) = a.plus(b)

  fun calculate(a: Int, b: Int, operation: (Int, Int) -> Int) = operation(a, b)

  fun main() {
    val result1 = calculate(5, 4) {a, b -> a * b}
    val result2 = calculate(5, 4, ::sum)

    println(result1)
    println(result2)
  }
  ```