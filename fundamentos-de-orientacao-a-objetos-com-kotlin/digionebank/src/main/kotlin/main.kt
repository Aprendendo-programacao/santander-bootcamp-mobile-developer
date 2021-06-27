class Pessoa {
    var nome: String = "Jether"
    var cpf: String = "123.125.323-31"

    private set

    constructor()

    fun unirNomeComCPF() = "$nome - $cpf"
}

fun main() {
    val jether: Pessoa = Pessoa()

    println(jether.nome)
    println(jether.cpf)
    println(jether.unirNomeComCPF())
}