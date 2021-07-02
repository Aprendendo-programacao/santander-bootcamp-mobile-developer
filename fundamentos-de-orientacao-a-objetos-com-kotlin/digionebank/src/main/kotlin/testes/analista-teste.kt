package testes

import Analista

fun main() {
    val joao = Analista("João", "0987654321", 1000.0)

    Utils.imprimirRelatorio(joao)
}