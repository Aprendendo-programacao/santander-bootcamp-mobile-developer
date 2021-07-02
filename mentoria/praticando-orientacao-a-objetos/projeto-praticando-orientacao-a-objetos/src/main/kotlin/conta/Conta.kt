package conta

// open e abstract podem ser herdadas
abstract class Conta(
    val numero: Int,
    val agencia: String,
    private var _saldo: Double
): MovimentacaoFinanceira {

    override fun sacar() {

    }

    override fun depositar() {

    }

    override fun transferir() {

    }

}