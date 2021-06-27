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