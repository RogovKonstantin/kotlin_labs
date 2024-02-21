package org.example

import java.util.*

fun main() {
    println("Введите имя")
    val name = readln().uppercase(Locale.getDefault())

    if (name.isEmpty() || !name.all { it.isLetter() }) {
        throw IllegalArgumentException("Имя должно содержать только буквы")
    }

    println("Введите возраст")
    val age: Int
    try {
        age = readln().toInt()
    } catch (e: NumberFormatException) {
        println("Ввод - целое число")
        return
    }

    println("Привет, $name! Тебе уже $age")
}