package testes

import ClienteTipo

fun main() {
    ClienteTipo.values().forEach { clienteTipo ->
        println("${clienteTipo.descricao} - $clienteTipo")
    }
    // OU
//    ClienteTipo.values().forEach {
//        println("${it.descricao} - $it")
//    }
}