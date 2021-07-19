# Desenvolvimento com mutableListOf

### mutableListOf

* **Características**

  * Aceita apenas 1 tipo de valor

  * Possui tamanho variável

  * Índice sempre começa em 0

* **Exemplo**

  ```kotlin
  val joao = Funcionario("João", 1000.0, "CLT")
  val pedro = Funcionario("Pedro", 4000.0, "PJ")
  val maria = Funcionario("Maria", 2000.0, "CLT")

  val funcionarios = mutableListOf(joao, pedro, maria)
  ```

### mutableSetOf

* **Características**

  * Aceita apenas 1 tipo de valor

  * Não aceita valores repetidos

    > A comparação dos objetos é feita a partir do `equals` e `hashcode`

  * Possui tamanho variável

  * Índice sempre começa em 0

### add

* Adicionar um elemento em uma MutableSet/MutableList

* **Exemplo**

  ```kotlin
  val joao = Funcionario("João", 1000.0, "CLT")
  val pedro = Funcionario("Pedro", 4000.0, "PJ")
  val maria = Funcionario("Maria", 2000.0, "CLT")

  val funcionarios = mutableListOf(joao, pedro)

  funcionarios.add(maria)
  funcionarios.forEach { println(it) }

  // Saída:
  // Nome: João
  // Salário: 1000.0
  // Nome: Pedro
  // Salário: 4000.0
  // Nome: Maria
  // Salário: 2000.0
  ```

### remove

* Remover um elemento de uma MutableSet/MutableList

* **Exemplo**

  ```kotlin
  val joao = Funcionario("João", 1000.0, "CLT")
  val pedro = Funcionario("Pedro", 4000.0, "PJ")
  val maria = Funcionario("Maria", 2000.0, "CLT")

  val funcionarios = mutableListOf(joao, pedro, maria)

  funcionarios.remove(pedro)
  funcionarios.forEach { println(it) }

  // Saída:
  // Nome: João
  // Salário: 1000.0
  // Nome: Maria
  // Salário: 2000.0
  ``` 