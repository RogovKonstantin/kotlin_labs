package org.example

fun main() {
    val num1 = 2
    val num2 = 6

    println("У вас есть числа: $num1 и $num2")
    println("1. Добавить")
    println("2. Отнять")
    println("0. Ничего")

    when (readln().toInt()) {
        1 -> println("Результат: ${num1 + num2}")
        2 -> println("Результат: ${num1 - num2}")
        0 -> return
        else -> println("Неверный ввод")
    }
}