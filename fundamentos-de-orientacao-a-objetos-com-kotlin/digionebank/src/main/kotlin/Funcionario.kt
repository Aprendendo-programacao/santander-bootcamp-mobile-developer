import java.math.BigDecimal

class Funcionario(
    override val nome: String,
    override val cpf: String,
    val salario: BigDecimal
): Pessoa(nome, cpf)