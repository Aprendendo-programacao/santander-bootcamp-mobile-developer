# Prática com DoubleArray

### DoubleArray

* **Características**

  * Aceita apenas valores do tipo `Double`

  * Possui tamanho fixo

  * Índice sempre começa em 0

* **Exemplo**

  ```kotlin
  val salaries = DoubleArray(3)

  salaries[0] = 1000.0
  salaries[1] = 2000.0
  salaries[2] = 500.0
  ```

### Função `forEachIndexed`

* Essa função tem como parâmetros, da expressão lambda, o índice e o valor correspondente a ele

* **Exemplo**

  ```kotlin
  salaries.forEachIndexed { index, salary ->
      salaries[index] = salary * 1.1
      println("Índice: $index - Salário: ${salaries[index]}")
  }
  ```

--- 

### doubleArrayOf

* **Características**: iguais ao do DoubleArray

* **Exemplo**

  ```kotlin
  val salaries = doubleArrayOf(
      1000.0,
      2000.0,
      500.0
  )
  ```

### Vantagens em relação ao DoubleArray

* Com a função `doubleArrayOf`, é possível declarar os valores do Array no argumento

  ```kotlin
  // DoubleArray
  val salaries = DoubleArray(3)

  salaries[0] = 1000.0
  salaries[1] = 2000.0
  salaries[2] = 500.0

  // doubleArrayOf
  val salaries = doubleArrayOf(
      1000.0,
      2000.0,
      500.0
  )
  ```