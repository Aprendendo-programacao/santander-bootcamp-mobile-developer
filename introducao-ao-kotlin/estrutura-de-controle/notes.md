# Estruturas de controle

### Visão geral

* **Operadores**

  * `if/else`

  * `when` (switch case)

  * **elvis operator**

* **Características**

  * Pode ser utilizado tanto para controle quanto para atribuição

  * Pode ser encadeado com múltiplas estruturas

### `if/else`

* **Exemplo**

  ```kotlin
  if (expressão) {
    // Corpo
  } else if (expressão) {
    // Corpo
  } else {
    // Bloco
  }
  ```

### `when`

* Substituição do encadeamento de `if/else`

* **Exemplo**

  ```kotlin
  when {
    caso1 -> {
      // Corpo
    }
    caso2 -> {
      // Corpo
    }
    else -> {
      // Corpo
    }
  }
  ```

### **Elvis operator**

* **Exemplo**

  ```kotlin
  val a: Int? = null
  var number = a ?: 0
  ```