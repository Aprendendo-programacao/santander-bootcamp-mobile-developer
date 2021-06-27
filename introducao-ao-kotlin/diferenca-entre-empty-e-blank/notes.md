# Diferença entre Empty e Blank

* Métodos de comparação

* Se o tamanho da `String` for 0 está _empty_ e _blank_

* Se o tamanho **for > 0** mas todos os caracteres são espaços em branco, esta `String` está _blank_ (mas não _empty_)

* **IMPORTANTE**: espaço em branco é considerado um caractere

* **Exemplo**

  ```kotlin
  val s = ""

  println(s.isEmpty()) // true
  println(s.isBlank()) // true
  ```

  ```kotlin
  val s = "   "

  println(s.isEmpty()) // false
  println(s.isBlank()) // true
  ```

  ```kotlin
  val s = ""

  println(s.isNullOrBlank()) // true
  println(s.isNullOrEmpty()) // true
  ```