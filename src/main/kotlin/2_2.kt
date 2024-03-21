package org.example

fun main() {
    val age: Int
    try {
        age = readln().toInt()
    } catch (e: NumberFormatException) {
        println("Ввод - целое число")
        return
    }


    when {
        age < 0 -> println("Такого не бывает")
        age > 18 -> println("Вам уже все можно")
        age == 18 -> println("Ура, Вам 18 лет!")
        else -> println("Вы еще слишком молоды")
    }
}