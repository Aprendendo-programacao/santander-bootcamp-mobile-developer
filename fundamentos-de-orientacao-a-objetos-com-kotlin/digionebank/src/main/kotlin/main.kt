class Pessoa {
    var nome: String = "Jether"
    var cpf: String = "123.125.323-31"

    inner class Endereco {
        var rua: String = "Rua teste"
    }
}

fun main() {
    val jether: Pessoa = Pessoa()

    println(jether.nome)
    println(jether.cpf)
    println(jether.Endereco().rua)
}