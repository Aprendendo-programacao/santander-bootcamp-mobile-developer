package testes

import Pessoa

fun main() {
    val jether: Pessoa = Pessoa(nome = "Jether Rodriges", cpf = "1234567890")

    println(jether.nome)
    println(jether.cpf)
}