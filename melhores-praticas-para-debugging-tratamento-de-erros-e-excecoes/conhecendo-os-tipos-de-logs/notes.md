# Conhecendo os tipos de logs

### Logcat

* Tipos de log da aplicação

* Criação de tags

* Emissão dinâmica de logs

* Omissão de logs irrelevantes

* Contextualização para *crashs* e *exceptions*

### Tipos de logs

* DEBUG (`log.d(...)`)

* ERROR (`log.e(...)`)

* INFO (`log.i(...)`)

* VERBOSE (`log.v(...)`)

* WARNINGS (`log.w(...)`)

* **Representação**

  ```kotlin
  Log.w("W/emptyField", "O campo de email não foi preenchido")
  ```

  * `Log.w`: tipo de log

  * `"W/emptyField"`: tag que permite agrupar logs do mesmo tipo

  * `"O campo de email não foi preenchido"`: mensagem que descreve o evento do log