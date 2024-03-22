package org.example

fun main() {
    val input = readLine()
    val numbers = input?.split(" ")?.map { it.toInt() }

    if (numbers != null && numbers.size >= 2) {
        val sortedNumbers = numbers.sorted()
        println(sortedNumbers[1])
    } else {
        println("должно быть минимум два числа")
    }
}