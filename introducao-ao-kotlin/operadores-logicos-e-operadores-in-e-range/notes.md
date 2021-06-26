# Operadores lógicos e Operadores In e Range

### Operadores lógicos

Função | Expressão | Comando
:-----: | :-----: | :-----:
e | `&&` | `(expressão1) and (expressão2)`
ou | `||` | `(expressão1) or (expressão2)`

* Quando utiliza-se o comando, é recomendado colocar a expressão entre parênteses

### Operadores `in` e **range**

Função | Expressão
:-----: | :-----:
contém | `in`
não contèm | `!in`
faixa de valores | `(início)..(fim)`

* Verificar se um valor está presente em uma lista ou uma faixa (**range**) de valores

* **Range** cria um intervalo de valores que inicia no primeiro parâmetro e acaba no segundo

* **Exemplo**

  ```kotlin
  val numbers = listOf(3, 9, 0, 1, 2)
  println(12 in numbers) // false
  ```

  ```kotlin
  println(12 in 0..20) // true
  ```
  
  ```kotlin
  val bingo = listOf(8, 6, 34, 2, 13)
  val number = (1..34).random()

  println(number)
  println(number in bingo)
  ```

  ```kotlin
  const val MIN_AGE = 16
  const val MAX_AGE = 68

  fun main() {
    val age = (10..100).random()

    // Com operadores in e range
    println(age in MIN_AGE..MAX_AGE)
    // Sem operadores in e range
    println(age >= MIN_AGE && age <= MAX_AGE)
  }
  ```