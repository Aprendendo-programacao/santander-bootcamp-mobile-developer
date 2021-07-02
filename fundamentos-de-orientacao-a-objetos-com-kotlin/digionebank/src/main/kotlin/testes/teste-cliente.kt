package testes

import Cliente

fun main() {

    val felipe = Cliente(
        "Felipe",
        "123818473",
        ClienteTipo.PF,
        "123456"
    )

    Utils.imprimirInfo(felipe)

    Autenticacao().autenticacao(felipe)

}