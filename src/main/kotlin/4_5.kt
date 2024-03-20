package org.example

fun main() {
    val input = readLine()
    val numbers = input?.split(",")?.map { it.trim().toInt() }

    if (numbers != null) {
        val sortedNumbers = numbers.sorted()
        println(sortedNumbers)
    } else {
        println("неверный ввод")
    }
}
//24, -63, 67, -12, 88, 94, -28, 82, 0, 53