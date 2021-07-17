fun main() {
    val salaries = doubleArrayOf(1000.0, 2000.0, 500.0, 3000.0)

    for (salary in salaries) {
        println(salary)
    }

    // max
    println("Maior salário: ${salaries.maxOrNull()}")

    // min
    println("Menor salário: ${salaries.minOrNull()}")

    // average
    println("Média salarial: ${salaries.average()}")

    // filter
    println("Salários maiores que '1500.0':")
    salaries.filter { it > 1500.0 }.forEach(::println)

    // count
    println(salaries.count { it in 2000.0..4000.0 })

    // find
    println(salaries.find { it == 2000.0 })

    // any
    println(salaries.any { it == 1000.0})
}