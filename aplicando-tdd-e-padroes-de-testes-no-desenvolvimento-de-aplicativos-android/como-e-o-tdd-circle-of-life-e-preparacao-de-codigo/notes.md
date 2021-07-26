# Como é o TDD circle of life e preparação do código

![](https://www.xenonstack.com/hs-fs/hubfs/Imported_Blog_Media/test-driven-development-process-cycle-2-1.png?width=606&height=585&name=test-driven-development-process-cycle-2-1.png)

### Definição

* Desenvolvimento dirigido por testes

* Teste são escritos antes da implementação de uma nova funcionalidade

### Estrutura do projeto (testes)

* **androidTest** = teste de UI (interface do usuário)

* **test** = teste unitários (funcionalidades específicas da aplicação)

### Nome de funções de testes

* Para ter mais liberdade e clareza na nomenclatura de uma função teste, utiliza-se acento grave (`) no começo e fim do nome da função

* **Exemplo**

  ```kotlin
  @Test
  fun `quando chamar o metodo getListContacts deve retornar 2 contatos`() {
    // Preparação
    TODO("Implementar preparação do mock")

    // Validação
    TODO("Validar valores de retorno do método")
  }
  ``` 