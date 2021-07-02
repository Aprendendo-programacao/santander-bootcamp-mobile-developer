package testes

import Funcionario
import Pessoa

class Utils {

    companion object {

        fun imprimirRelatorio(funcionario: Funcionario) = println(funcionario.toString())

        fun imprimirInfo(pessoa: Pessoa) = println(pessoa.toString())
    }

}