# Sobre Throwable e Exceptions

### ANRs

> ANR = Application Not Responding

* Aplicação não está respondendo

* Falta de retorno a interação do usuário

* Bloqueio da UI thread

* *Dialog* que permite forçar o fechamento da aplicação

### Throwable

* Superclasse de todos os ***Erros*** e ***Exceptions***

* Erros: podem ocorrer em tempo de execução ou compilação

* *Exceptions*: geralmente quebram a aplicação (*crash*)

### Exceptions

* Subclasse de *Throwable*

* **Exemplos**

  * ActivityNotFountException

  * NullPointerException

  * IndexOutOfBoundsException

  * ClassCastException

### Evitar Exceptions/Erros

* Mapeamento de exceptions esperadas com `try-catch`

* Prevenir operações indevidas

  * **Exemplos**: operações durante iteração, casts inválidos, tipos nullable sem tratamento, ...

* Testes unitários

### Tratar Exceptions/Erros

* *Null check*

* Retorno visual do erro

* Criação de um ExceptionHandler