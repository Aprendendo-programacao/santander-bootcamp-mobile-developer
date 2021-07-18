data class Funcionario(
    val nome: String,
    val salario: Double,
) {
    override fun toString(): String {
        return """
            Nome: $nome
            Salário: $salario
        """.trimIndent()
    }
}

fun main() {
    val joao = Funcionario("João", 1000.0)
    val pedro = Funcionario("Pedro", 2000.0)
    val maria = Funcionario("Maria", 4000.0)

    val funcionarios = listOf(joao, pedro, maria)

    funcionarios.forEach {
        println(it)
    }

    println(funcionarios.find { it.nome == "Maria" })
}