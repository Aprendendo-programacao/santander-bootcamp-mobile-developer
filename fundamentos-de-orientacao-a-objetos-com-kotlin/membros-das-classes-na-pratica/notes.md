# Membros das classes na prática

### Parte I

```kotlin
class Pessoa {
    var nome: String = "Jether"
    var cpf: String = "123.125.323-31"

    inner class Endereco {
        var rua: String = "Rua teste"
    }
}
```

* **outer class** = Pessoa
* **inner class** = Endereco

* Acessar um atributo de uma **inner class**

  ```kotlin
  val pessoa = Pessoa()

  println(pessoa.Endereco().rua ) // Rua teste
  ```

### Parte II

```kotlin
class Pessoa {
    var nome: String = "Jether"

    var cpf: String = "123.125.323-31"

    private set
}
```

* `private set` = modificar o acesso do setters para privado, ou seja, esse atributo não poderá ser alterado após sua instanciação

### Parte III

```kotlin
class Pessoa {
    var nome: String = "Jether"
    var cpf: String = "123.125.323-31"

    private set

    constructor() // Construtor secundário

    fun unirNomeComCPF() = "$nome - $cpf"
}
```

* **Membros** = atributos e funções de uma classe