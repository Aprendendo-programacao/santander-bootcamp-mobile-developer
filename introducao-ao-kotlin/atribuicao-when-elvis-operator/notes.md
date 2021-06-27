# Atribuições, when e Elvis operator

### Atribuição

* O valor atribuído tem que estar na última linha do bloco

* A condicional pode não usar chaves se só fizer a atribuição

* **Exemplo**

  ```kotlin
  val maxValue = if (a > b) a else if (a < b) b else b
  ```

  ```kotlin
  val minValue = if (a > b) {
    println("b($b) é o menor valor")
    b
  } else if (a < b) {
    println("a($a) é o menor valor")
    a
  } else {
    println("Os valores são iguais")
    b
  }
  ```

### `when`

* Equivalente ao switch de outras linguagens

* Aceita tanto valores quanto condicionais

* Aceita range como _case_

* **Exemplos**

  ```kotlin
  when {
    a > b -> { 
      // Corpo 
    }
    a != b && a > c -> {
      // Corpo
    }
    else -> {
      // Corpo
    }
  }
  ```

  ```kotlin
  when(year) {
    -4000..475 -> println("Antiguidade")
    476..1452 -> println("Idade Média")
    1453..1798 -> println("Idade Moderna")
    currentYear -> println("Idade Contemporânea")
  }
  ```

### Elvis operator

* O amis próximo que a linguagem possui de um operador ternário

* Verificar se é um valor nulo e aprensetar uma opção caso seja

* Pode ser encadeado (**CUIDADO**)

* **Exemplos**

  ```kotlin
  val a: Int? = null
  val c: Int? = 9
  var number = a ?: b ?: 0
  ```

  ```kotlin
  fun Int.getStudentStatus(): String {
    println("Nota: $this")

    return when (this) {
      in 0..4 -> "Reprovado"
      in 5..7 -> "Mediano"
      in 8..9 -> "Bom"
      10 -> "Excelente"

      else -> "Indefinido"
    }
  }

  fun main() {
    val grade = (0..10).random()

    println(grade.getStudentStatus())
  }
  ```