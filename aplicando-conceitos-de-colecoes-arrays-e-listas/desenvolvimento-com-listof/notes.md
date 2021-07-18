# Desenvolvimento com listOf

### listOf

* **Características**

  * Aceita apenas 1 tipo de valor

  * Possui tamanho fixo

  * Índice sempre começa em 0

* **Exemplo**

  ```kotlin
  val joao = Funcionario("João", 1000.0)
  val pedro = Funcionario("Pedro", 2000.0)
  val maria = Funcionario("Maria", 4000.0)

  val funcionarios = listOf(joao, pedro, maria)
  ```