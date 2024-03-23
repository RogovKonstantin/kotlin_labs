package org.example
fun main() {
    println("Введите число:")
    val number = readLine()?.toIntOrNull()

    if (number == null) {
        println("Ввод - число")
        return
    }

    val absNumber = Math.abs(number)
    val result = mutableListOf<Int>()

    for (i in 1..absNumber/2) {
        if (absNumber % i == 0) {
            result.add(i)
        }
    }
    result.add(number)
    println(result.joinToString())
}