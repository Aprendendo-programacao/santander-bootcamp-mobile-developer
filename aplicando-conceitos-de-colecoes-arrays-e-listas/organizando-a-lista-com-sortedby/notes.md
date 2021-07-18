# Organizando a lista com sortedBy

### sortedBy

* Ordenar os elementos de uma List/Array, em ordem crescente, com base em um seletor (*selector*)

* **Exemplo**

  ```kotlin
  val joao = Funcionario("João", 1000.0)
  val pedro = Funcionario("Pedro", 4000.0)
  val maria = Funcionario("Maria", 2000.0)

  val funcionarios = listOf(joao, pedro, maria)

  funcionarios
        .sortedBy { it.salario }
        .forEach { println(it) }

  // Saída:
  // Nome: João
  // Salário: 1000.0
  // Nome: Maria
  // Salário: 2000.0
  // Nome: Pedro
  // Salário: 4000.0
  ```