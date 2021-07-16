fun main() {
    // Array
    val values = Array(3) {""}

    values[0] = "Maria"
    values[1] = "João"
    values[2] = "José"

    values.forEach {
        println(it)
    }

    values.sort()

    values.forEach {
        println(it)
    }

    // arrayOf
    val strings = arrayOf(
        "Maria",
        "João",
        "José"
    )

    strings.forEach {
        println(it)
    }

    strings.sort()

    strings.forEach {
        println(it)
    }
}