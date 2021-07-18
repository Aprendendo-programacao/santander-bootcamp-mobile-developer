fun main() {
    val joao = Funcionario("João", 1000.0, "CLT")
    val pedro = Funcionario("Pedro", 4000.0, "PJ")
    val maria = Funcionario("Maria", 2000.0, "CLT")

    val funcionarios = listOf(joao, pedro, maria)

    funcionarios.forEach {
        println(it)
    }

    println("----------------------------------------")

    println(funcionarios.find { it.nome == "Maria" })

    println("----------------------------------------")

    funcionarios
        .sortedBy { it.salario }
        .forEach { println(it) }

    println("----------------------------------------")

    funcionarios
        .groupBy { it.tipoContratacao }
        .forEach { println(it) }
}