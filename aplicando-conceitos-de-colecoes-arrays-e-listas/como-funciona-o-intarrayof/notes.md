# Como funciona o intArrayOf

### intArrayOf

* **Características**

  * Aceita apenas valores do tipo `Int`

  * Possui tamanho fixo

  * Índice sempre começa em 0

* **Exemplo**

  ```kotlin
  val values = intArrayOf(2, 5, 4, 7, 3, 1)
  ```

### Vantagens em relação ao IntArray

* Com a função `intArrayOf`, é possível declaras os valores do Array nos argumentos

  ```kotlin
  // IntArray
  val values = IntArray(5)

  values[0] = 1
  values[1] = 2
  values[2] = 3
  values[3] = 4
  values[4] = 5

  // intArrayOf
  val values = intArrayOf(1, 2, 3, 4, 5)
  ```