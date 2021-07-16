# Introdução e desenvolvimento de arrays

### IntArray

* **Características**

  * Aceita apenas valores do tipo `Int`

  * Possui tamanho fixo

  * Índice sempre começa em 0

* **Exemplo**

  ```kotlin
  val values = IntArray(5)

  values[0] = 1
  values[1] = 2
  values[2] = 3
  values[3] = 4
  values[4] = 5
  ```

### Iteração de um Array

* **Função**: percorrer cada elemento de um List/Array

* **Exemplo**

  * `for`

    ```kotlin
    for (value in values) {
        println(value)
    }
    ```

  * `forEach`

    ```kotlin
    values.forEach {
        println(it)
    }
    ```

    > Por padrão, o nome do parâmetro da expressão lambda é *it*

    **OU**

    ```kotlin
    values.forEach { value ->
        println(value)
    }
    ```

### Índice

* **Função**: posição de um valor na List/Array

* **Exemplo**

  ```kotlin
  for (index in values.indices) {
      println("Índice: $index - Valor: ${values[index]}")
  }
  ```

  > Para obter os índices de um Array: `.indices`

### Ordenar (`.sort()`)

* A função `.sort()` ordena os valores em ordem crescente, ou seja, do menor para o maior

* **Exemplo**

  ```kotlin
  values.sort()
  ```