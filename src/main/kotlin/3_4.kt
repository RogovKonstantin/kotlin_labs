package org.example

fun main() {
    println("Введите число:")
    val number = readLine()?.toIntOrNull()

    if (number == null) {
        println("Ввод - число.")
        return
    }

    var evenCount = 0
    var oddCount = 0

    number.toString().forEach { digitChar ->
        val digit = Character.getNumericValue(digitChar)
        if (digit % 2 == 0) {
            evenCount++
        } else {
            oddCount++
        }
    }

    println("Количество четных цифр: $evenCount")
    println("Количество нечетных цифр: $oddCount")
}