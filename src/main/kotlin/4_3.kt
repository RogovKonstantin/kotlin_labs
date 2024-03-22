package org.example

fun main() {
    val input = readLine()
    val numbers = input?.split(", ")?.map { it.toInt() }

    if (numbers != null) {
        val list = numbers.toMutableList()

        val min = list.minOrNull()
        val max = list.maxOrNull()

        println("Minimum: $min")
        println("Maximum: $max")
    } else {
        println("неправильный ввод")
    }
}
//24, -63, 67, -12, 88, 94, -28, 82, 0, 53