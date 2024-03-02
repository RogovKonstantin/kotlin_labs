package org.example


fun main() {
    val num1: Int
    val num2: Int
    val num3: Int

    try {
        num1 = readLine()?.toInt() ?: 0
        num2 = readLine()?.toInt() ?: 0
        num3 = readLine()?.toInt() ?: 0
    } catch (e: NumberFormatException) {
        println("Ввод - целое число")
        return
    }
    val numbers = listOf(num1, num2, num3)
    val distinctNumbers = numbers.distinct().sorted()
    if (distinctNumbers.size == 3) {
        println(distinctNumbers[1])
    } else {
        println("Ошибка")
    }
}