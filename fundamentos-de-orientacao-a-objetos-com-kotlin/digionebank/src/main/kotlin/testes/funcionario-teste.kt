package testes

import Funcionario
import java.math.BigDecimal

fun main() {
    val joao = Funcionario("João", "0987654321", BigDecimal.valueOf(1000.0))

    println(joao.nome)
    println(joao.cpf)
    println(joao.salario)
}