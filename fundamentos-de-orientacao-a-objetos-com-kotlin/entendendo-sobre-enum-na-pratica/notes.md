# Entendendo sobre Enum na prática - Parte 2

### Enum com propriedades privadas

```kotlin
enum class ClienteTipo(
    descricao: String
) {
    PF("Pessoa Física"),
    PJ("Pessoa Jurídica");
}
```

* Com a declaração de um atributo sem indicar `val` ou `var`, então ele será visível apenas para o escopo da classe

### Enum com propriedades acessíveis por outras classes

```kotlin
enum class ClienteTipo(
    val descricao: String
) {
    PF("Pessoa Física"),
    PJ("Pessoa Jurídica");
}
```

* Ao indicar o atributo com `val`, outras classes poderão apenas pegar o valor, pois como se trata de um variável imutável seu valor não pode ser reatribuído

### Funções estáticas

```kotlin
companion object {

  // funções estáticas

}
```