# Prática com Array de strings

### Array

* **Características**

  * Aceita um único tipo de valor (definido por `Array<Tipo>`)

  * Possui tamanho fixo

  * Índice sempre começa em 0

* **Exemplo**

  ```kotlin
  val values = Array<String>(3) {""}

  values[0] = "Maria"
  values[1] = "João"
  values[2] = "José"
  ```

  > Como o valor inicial é do tipo **String**, então não é necessário declará-lo explicitamente

  **OU**

  ```kotlin
  val values = Array(3) {""}

  values[0] = "Maria"
  values[1] = "João"
  values[2] = "José"
  ```

### Iteração

```kotlin
values.forEach {
    println(it)
}

// Saída

```

### Ordenação (`.sort()`)

* **Função**: ordenar os elementos do Array em ordem alfabética

* **Exemplo**

  ```kotlin
  values.sort()
  ``` 

---

### ArrayOf

* **Características**: iguais ao do Array

* **Exemplo**

  ```kotlin
  val values = arrayOf(
      "Maria",
      "João",
      "José"
  )
  ``` 

### Vantagens em relação ao Array

* Com a função `arrayOf`, é possível declaras os valores do Array no argumento

  ```kotlin
  // Array
  val values = Array(3) {""}

  values[0] = "Maria"
  values[1] = "João"
  values[2] = "José"

  // arrayOf
  val values = arrayOf(
      "Maria",
      "João",
      "José"
  )
  ```