# Operações com Arrays count, find e any

### Count

* Contar os elementos que condizem com uma condição (*predicate*)

* **Exemplo**

  ```kotlin
  val salaries = doubleArrayOf(1000.0, 2000.0, 500.0, 3000.0)

  println(salaries.count { it in 2000.0..4000.0 }) // 2
  ```

### Find

* Pegar um elemento específico que condiz com uma condição (*predicate*), caso não exista nenhum elemento que atenda essa condição, então é retornado `null`

* **Exemplo**

  ```kotlin
  val salaries = doubleArrayOf(1000.0, 2000.0, 500.0, 3000.0)

  println(salaries.find { it == 2000.0 }) // 2000.0
  println(salaries.find { it == 5000.0 }) // null
  ```

### Any

* Verificar se existe algum elemento que condiz com uma condição (*predicate*), caso na encontre, então é retornado `false`

* **Exemplo**

  ```kotlin
  val salaries = doubleArrayOf(1000.0, 2000.0, 500.0, 3000.0)

  println(salaries.any { it == 1000.0}) // true
  println(salaries.any { it == 5000.0}) // false
  ```