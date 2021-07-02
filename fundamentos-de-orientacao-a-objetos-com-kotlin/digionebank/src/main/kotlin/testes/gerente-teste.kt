package testes

import Gerente

fun main() {
    val maria = Gerente("Maria", "0987654321", 5000.0)

    Utils.imprimirRelatorio(maria)
}