# Desenvolvimento com mutableMapOf

### mutableMapOf

* **Características**

  * Coleção que armazena um par de objetos ("chave-valor")

  * Tamanho variável

  * Aceita 2 tipos de valores, sendo 1 para a "chave" e o outro para o "valor"

  * O índice é a "chave"

* **Exemplo**

  ```kotlin
  val joao = Funcionario("João", 1000.0, "CLT")
  val pedro = Funcionario("Pedro", 4000.0, "PJ")
  val maria = Funcionario("Maria", 2000.0, "CLT")

  val map = mutableMapOf<String, Funcionario>()
  ```

### Indexing operator

* Adicionar um elemento por meio do *indexing operator*

* **Exemplo**

  ```kotlin
  val joao = Funcionario("João", 1000.0, "CLT")
  val pedro = Funcionario("Pedro", 4000.0, "PJ")
  val maria = Funcionario("Maria", 2000.0, "CLT")

  val map = mutableMapOf<String, Funcionario>()

  map[joao.name] = joao
  map[pedro.name] = pedro
  map[maria.name] = maria

  println(map[joao.name])

  // Saída:
  // Nome: João
  // Salário: 1000.0
  ```

### values

* Recuperar todos os valores (*values*) do *Map*

* **Exemplo**

  ```kotlin
  val joao = Funcionario("João", 1000.0, "CLT")
  val pedro = Funcionario("Pedro", 4000.0, "PJ")
  val maria = Funcionario("Maria", 2000.0, "CLT")

  val map = mutableMapOf<String, Funcionario>()

  map[joao.name] = joao
  map[pedro.name] = pedro
  map[maria.name] = maria

  map.values.forEach { println(it) }

  // Saída:
  // Nome: João
  // Salário: 1000.0
  // Nome: Pedro
  // Salário: 4000.0
  // Nome: Maria
  // Salário: 2000.0
  ```

### remove

* Remove um elemento do *Map* a partir da chave (*key*)

* **Exemplo**

  ```kotlin
  val joao = Funcionario("João", 1000.0, "CLT")
  val pedro = Funcionario("Pedro", 4000.0, "PJ")
  val maria = Funcionario("Maria", 2000.0, "CLT")

  val map = mutableMapOf<String, Funcionario>()

  map[joao.name] = joao
  map[pedro.name] = pedro
  map[maria.name] = maria

  map.remove(maria.nome)

  map.values.forEach { println(it) }

  // Saída
  // Nome: João
  // Salário: 1000.0
  // Nome: Pedro
  // Salário: 4000.0
  ``` 