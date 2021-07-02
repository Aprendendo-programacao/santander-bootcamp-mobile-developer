package conta

class ContaPessoaFisica(
    numero: Int,
    agencia: String
) {
    // Propriedades imutáveis
    private val _numeroConta = numero // Convenção: uso de underline antes de variável privadas
    private val _agencia = agencia

    /* Modificadores de acesso em propriedades

        * private = visível apenas na classe
        * public (padrão de todas varíavel em Kotlin)
        * protected = visível apenas para classe "filhas"
     */

    init {
        println("num: $numero - agencia: $agencia")
    }

}