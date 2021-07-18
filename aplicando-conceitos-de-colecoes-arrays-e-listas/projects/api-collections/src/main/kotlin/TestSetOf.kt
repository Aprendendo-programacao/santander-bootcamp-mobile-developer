fun main() {
    val joao = Funcionario("João", 1000.0, "CLT")
    val pedro = Funcionario("Pedro", 4000.0, "PJ")
    val maria = Funcionario("Maria", 2000.0, "CLT")

    val funcionarios1 = setOf(joao, pedro)
    val funcionarios2 = setOf(maria)

    val funcionariosUniao = funcionarios1.union(funcionarios2)
    funcionariosUniao.forEach { println(it) }

    println("------------------------------------")

    val funcionarios3 = setOf(joao, maria, pedro)
    val funcionariosSubtracao = funcionarios3.subtract(funcionarios2)
    funcionariosSubtracao.forEach { println(it) }

    println("------------------------------------")

    val funcionariosInterseccao = funcionarios3.intersect(funcionarios2)
    funcionariosInterseccao.forEach { println(it) }
}