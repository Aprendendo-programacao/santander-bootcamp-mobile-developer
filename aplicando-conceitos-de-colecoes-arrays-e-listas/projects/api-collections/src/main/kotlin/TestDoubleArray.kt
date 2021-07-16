fun main() {
    // DoubleArray
    val salaries = DoubleArray(3)

    salaries[0] = 1000.0
    salaries[1] = 2000.0
    salaries[2] = 500.0

    salaries.forEach {
        println(it)
    }

    salaries.forEachIndexed { index, salary ->
        salaries[index] = salary * 1.1
        println("Índice: $index - Salário: ${salaries[index]}")
    }

    // doubleArrayOf
    val salaries1 = doubleArrayOf(
        1000.0,
        2000.0,
        500.0
    )


}