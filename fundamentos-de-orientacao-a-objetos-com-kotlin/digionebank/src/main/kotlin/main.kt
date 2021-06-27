class Pessoa {
    var nome: String = "Jether"
    var cpf: String = "123.125.323-31"
}

fun main() {
    val jether: Pessoa = Pessoa()

    println("${jether.nome} - ${jether.cpf}")
}