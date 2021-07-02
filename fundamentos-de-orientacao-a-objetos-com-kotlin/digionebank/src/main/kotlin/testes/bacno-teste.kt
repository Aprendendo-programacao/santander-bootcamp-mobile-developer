package testes

import Banco

fun main() {
    // Named parameters:
    // val digiOne = Banco(numero = 12, nome = "DigiOne")
    val digiOne = Banco(nome = "DigiOne", numero = 12)

    println(digiOne.nome)
    println(digiOne.numero)

    val banco2 = digiOne.copy(nome = "Banco2")

    println(banco2.info())
}