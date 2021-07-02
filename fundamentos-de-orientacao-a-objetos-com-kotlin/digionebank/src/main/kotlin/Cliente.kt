class Cliente(
    nome: String,
    cpf: String,
    val tipo: ClienteTipo,
    val senha: String
): Pessoa(nome, cpf), Logavel {

    override fun login(): Boolean = senha == "123456"

    override fun toString(): String = """
        Nome: $nome
        CPF: $cpf
        Tipo: ${tipo.descricao}
    """.trimIndent()
}