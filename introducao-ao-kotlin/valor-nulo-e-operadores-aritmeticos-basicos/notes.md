# Valor nulo e Operadores aritméticos básicos

### _Nullability_

* Qualquer tipo pode ser nulo, porém isso deve ser explicitado na declaração de variável através do uso da interrogação (`?`)

* A inferência de tipo não atribui _nullability_

* **Exemplo**

  * Atribuição correta do valor `null`

    ```kotlin
    var month: Int? = null 
    ```

  * Atribuição incorreta do valor `null`

    ```kotlin
    var day: Int = null // ERRO: Nulo não pode ser um valor de tipo não nulo Int
    ```

### Operadores aritméticos

Função | Expressão | Comando | Atribuição
:-----: | :-----: | :-----: | :-----: 
soma | `a + b` | `a.plus(b)` | `a += b`
subtração | `a - b` | `a.minus(b)` | `a -= b`
multiplicação | `a * b` | `a.times(b)` | `a *= b`
divisão | `a / b` | `a.div(b)` | `a /= b`
resto | `a % b` | `a.mod(b)` | `a %= b`

* Podem ser chamados tanto como expressão quanto como comando

* A função de soma também funciona para concatenar `String`s

* **Exemplo**

  ```kotlin
  fun main() {
    val count = 10
    val times = 9
    val result = times + count
    
    println(result)
  }
  ```

  ```kotlin
  fun main() {
    val count = 10
    val times = 9
    val result = times + count
    
    println(count.plus(times))
  }
  ```

  ```kotlin
  fun main() {
    val count = 10
    val times = 9
    times += count
    
    println(times)
  }
  ```