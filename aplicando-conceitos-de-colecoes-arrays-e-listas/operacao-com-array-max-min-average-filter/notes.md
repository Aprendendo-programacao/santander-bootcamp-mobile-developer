# Operações com Arrays max, min, average e filter

### Max

* Pegar o elemento com o maior valor da List/Array

* **Exemplo**

  ```kotlin
  val salaries = doubleArrayOf(1000.0, 2000.0, 500.0, 3000.0)

  println("Maior salário: ${salaries.maxOrNull()}") // 3000.0
  ```

### Min

* Pegar o elemento com o menor valor da List/Array

* **Exemplo**

  ```kotlin
  val salaries = doubleArrayOf(1000.0, 2000.0, 500.0, 3000.0)

  println("Menor salário: ${salaries.minOrNull()}") // 500.0
  ```

### Average

* Pegar a média dos valores da List/Array

* **Exemplo**

  ```kotlin
  val salaries = doubleArrayOf(1000.0, 2000.0, 500.0, 3000.0)

  println("Média salarial: ${salaries.average()}") // 1625.0
  ```

### Filter

* Pegar apenas os elementos que condizem com uma determinada condição (*predicate*)

* **Exemplo**

  ```kotlin
  val salaries = doubleArrayOf(1000.0, 2000.0, 500.0, 3000.0)

  salaries.filter { it > 1500.0 }.forEach(::println) // 2000.0, 3000.0
  ```