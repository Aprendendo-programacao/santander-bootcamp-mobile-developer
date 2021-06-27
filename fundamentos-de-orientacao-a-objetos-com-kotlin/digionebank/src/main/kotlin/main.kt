class Pessoa {
    var nome: String = "Jether"

    var cpf: String = "123.125.323-31"

    private set
}

fun main() {
    val jether: Pessoa = Pessoa()

    // jether.cpf = "23234" // Erro

    println(jether.nome)
    println(jether.cpf)
}