# Desenvolvimento com mapOf

### setOf

* **Características**

  * Aceita apenas 1 tipo de valor

  * Possui tamanho fixo

  * Índice sempre começa em 0

* **Exemplo**

  ```kotlin
  val joao = Funcionario("João", 1000.0, "CLT")
  val pedro = Funcionario("Pedro", 4000.0, "PJ")
  val maria = Funcionario("Maria", 2000.0, "CLT")

  val funcionarios = setOf(joao, maria, pedro)
  ```

### union

* Unir os elementos de 2 conjuntos (*set*)

* **Exemplo**

  ```kotlin
  val joao = Funcionario("João", 1000.0, "CLT")
  val pedro = Funcionario("Pedro", 4000.0, "PJ")
  val maria = Funcionario("Maria", 2000.0, "CLT")

  val funcionarios1 = setOf(joao, pedro)
  val funcionarios2 = setOf(maria)

  val funcionariosUniao = funcionarios1.union(funcionarios2)
  funcionariosUniao.forEach { println(it) }

  // Saída
  // Nome: João
  // Salário: 1000.0
  // Nome: Pedro
  // Salário: 4000.0
  // Nome: Maria
  // Salário: 2000.0
  ```

### subtract

* Subtrair os elementos repetidos de 2 conjuntos (*set*)

* **Exemplo**

  ```kotlin
  val joao = Funcionario("João", 1000.0, "CLT")
  val pedro = Funcionario("Pedro", 4000.0, "PJ")
  val maria = Funcionario("Maria", 2000.0, "CLT")

  val funcionarios1 = setOf(joao, maria, pedro)
  val funcionarios2 = setOf(maria)

  val funcionariosSubtracao = funcionarios1.subtract(funcionarios2)
  funcionariosSubtracao.forEach { println(it) }

  // Saída
  // Nome: João
  // Salário: 1000.0
  // Nome: Pedro
  // Salário: 4000.0
  ```

### insect

* intersecção de 2 conjuntos (*set*), ou seja, obter apenas os elementos que estão presentes apenas no primeiro conjunto

* **Exemplo**

  ```kotlin
  val joao = Funcionario("João", 1000.0, "CLT")
  val pedro = Funcionario("Pedro", 4000.0, "PJ")
  val maria = Funcionario("Maria", 2000.0, "CLT")

  val funcionarios1 = setOf(joao, maria, pedro)
  val funcionarios2 = setOf(maria)

  val funcionariosInterseccao = funcionarios1.intersect(funcionarios2)
  funcionariosInterseccao.forEach { println(it) }

  // Saída
  // Nome: Maria
  // Salário: 2000.0
  ```