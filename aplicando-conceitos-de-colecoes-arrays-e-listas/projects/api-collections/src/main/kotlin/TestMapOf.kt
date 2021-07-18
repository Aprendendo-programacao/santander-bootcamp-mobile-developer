fun main() {
    val joao: Pair<String, Double> = Pair("João", 1000.0)
    val maria: Pair<String, Double> = Pair("Maria", 2000.0)
    val mapa1 = mapOf(joao, maria)

    mapa1.forEach { (key, value) -> println("Chave: $key - Valor: $value") }

    println("-----------------------")

    // to = infix keyword (https://kotlinlang.org/docs/functions.html#infix-notation)
    val mapa2 = mapOf(
        "Pedro" to 2000.0,
        "Maria" to 3000.0,
    )

    mapa2.forEach { (key, value) -> println("Chave: $key - Valor: $value") }
}