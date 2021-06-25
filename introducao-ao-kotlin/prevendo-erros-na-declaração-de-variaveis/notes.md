# Prevendo erros na declaração de variáveis

### Possíveis erros

* Sem declarar um tipo explicitamente ou implicitamente a uma variável

  * **Problema**

    ```kotlin
    var age
    age = 90 // ERRO: "Esta variável deve ter uma declaração de tipo ou ser inicializada"
    ```

  * **Solução**

    ```kotlin
    var age = 90 //✅
    ```

    ```kotlin
    var age: Int
    age = 90 //✅
    ```

  * **Conclusão**: uma variável **não pode** ser declarada **sem tipo e sem atribuição**

* Mudar o tipo de uma mesma variável

  * **Problema**

    ```kotlin
    var year = "Ano" // inferência de tipo: String
    year = 2021 // ERRO: "The integer literal does not conform to the expected type String"
    ```

  * **Solução**

    ```kotlin
    var year = "Ano"
    year = 2021.toString() //✅
    ```

  * **Conclusão**: uma variável com **inferência de tipo** só receberá **valores do mesmo tipo que sua primeira atribuição**