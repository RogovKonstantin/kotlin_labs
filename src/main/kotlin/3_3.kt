package org.example
fun main() {
    println("Введите число:")
    val number = readLine()?.toIntOrNull()

    if (number == null) {
        println("Ввод - число")
        return
    }

    val absNumber = Math.abs(number)

    for (i in 1..absNumber) {
        if (absNumber % i == 0) {
            println(i)
        }
    }
}