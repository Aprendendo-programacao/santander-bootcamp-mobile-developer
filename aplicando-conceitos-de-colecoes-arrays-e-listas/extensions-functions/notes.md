# Introdução a Extensions Functions

### Extensions Functions (funções estendidas)

* Criar uma função para uma classe específica, mas sem a necessidade de utilizar herança ou [*Decorator Pattern*](https://refactoring.guru/pt-br/design-patterns/decorator)

* **Exemplo**

  ```kotlin
  fun Array<BigDecimal>.somatoria() = this.reduce {
        acc, bigDecimal -> acc + bigDecimal
  }

  fun Array<BigDecimal>.media() =
      if (this.isEmpty()) BigDecimal.ZERO
      else this.somatoria() / this.size.toBigDecimal()

  fun main() {
    val salarios = arrayOf(
        "2000".toBigDecimal(),
        "1500".toBigDecimal(),
        "4000".toBigDecimal(),
    )

    println(salarios.somatoria()) // 7500
    println(salarios.media()) // 2500

  }
  ```