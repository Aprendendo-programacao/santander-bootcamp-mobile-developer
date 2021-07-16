fun main() {
    val values = IntArray(5)

    values[0] = 1
    values[1] = 2
    values[2] = 3
    values[3] = 4
    values[4] = 5

    // Iteração:
    for (value in values) {
        println(value)
    }

    values.forEach { value ->
        println(value)
    }

    // Índice
    for (index in values.indices) {
        println("Índice: $index - Valor: ${values[index]}")
    }

    values.sort()
    for (index in values.indices) {
        println("Índice: $index - Valor: ${values[index]}")
    }
}