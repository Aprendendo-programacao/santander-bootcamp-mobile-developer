# Como declarar variáveis

### var

* **Valor mutável** (valor definido e alterado tem tempo de execução)

* **Padrão de nomenclatura**: camelcase (**Exemplo**: `minhaVariavel`)

* **Exemplo**

  ```kotlin
  var age = 22
  ```

  ```kotlin
  var age: Int?
  age = null
  age = 22
  ```

### val

* **Valor imutável** (valor definido, uma única vez, tem tempo de execução)

* Similar ao `final` no Java

* **Padrão de nomenclatura**: CamelCase (**Exemplo**: `minhaVariavel`)

* **Exemplo**

  ```kotlin
  val age = 22
  ```

  ```kotlin
  val age: Int?
  age = null
  // OU 
  age = 22
  ```

### const val

* **Valor imutável**

* Valor definido tem tempo de compilação, ou seja, esse valor só pode ser consultado

* **Padrão de nomenclatura**: snakecase (**Exemplo**: `MINHA_CONSTANTE`)

* **Exemplo**

  ```kotlin
  const val MIN_AGE = 16
  ```

  ```kotlin
  const val MAX_AGE = 68
  ```