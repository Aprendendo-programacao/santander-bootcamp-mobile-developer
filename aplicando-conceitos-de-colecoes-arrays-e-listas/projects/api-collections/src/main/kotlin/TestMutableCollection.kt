fun main() {
    val joao = Funcionario("João", 1000.0, "CLT")
    val pedro = Funcionario("Pedro", 4000.0, "PJ")
    val maria = Funcionario("Maria", 2000.0, "CLT")

    val funcionarios = mutableListOf(joao, pedro)

    funcionarios.forEach { println(it) }

    println("------------------------------------")

    funcionarios.add(maria)
    funcionarios.forEach { println(it) }

    println("------------------------------------")

    funcionarios.remove(pedro)
    funcionarios.forEach { println(it) }

    println("------------------------------------")

    val funcionariosSet = mutableSetOf(joao)

    funcionariosSet.forEach { println(it) }

    println("------------------------------------")

    funcionariosSet.add(pedro)
    funcionariosSet.add(maria)

    funcionariosSet.forEach { println(it) }

    println("------------------------------------")

    funcionariosSet.remove(maria)
    funcionariosSet.forEach { println(it) }
}