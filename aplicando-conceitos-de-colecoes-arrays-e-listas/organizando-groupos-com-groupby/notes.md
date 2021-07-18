# Organizando grupos com groupBy

### groupBy

* Agrupar, em um mapa (*map*: "chave-valor"), com base em um seletor de chave (*Key Selector*) 

* **Exemplo**

  ```kotlin
  val joao = Funcionario("João", 1000.0, "CLT")
  val pedro = Funcionario("Pedro", 4000.0, "PJ")
  val maria = Funcionario("Maria", 2000.0, "CLT")

  val funcionarios = listOf(joao, pedro, maria)

  funcionarios
        .groupBy { it.tipoContratacao }
        .forEach { println(it) }

  // Saída
  // CLT=[Nome: João Salário: 1000.0, Nome: Maria Salário: 2000.0]
  // PJ=[Nome: Pedro Salário: 4000.0]
  ```