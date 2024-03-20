package org.example

fun main() {
    val input = readLine()
    val numbers = input?.split(",")?.map { it.trim().toInt() }

    if (numbers != null) {
        val average = numbers.average()
        val greaterThanAverage = numbers.filter { it > average }
        println("числа больше среднего значения($average): $greaterThanAverage")
    } else {
        println("Неверный ввод")
    }
}
//5, 8, 18, 34, 3, 56, 43, 27, 4, 23