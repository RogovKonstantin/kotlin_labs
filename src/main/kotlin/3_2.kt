package org.example
fun main() {
    val numberToGuess = (1..9).random()
    var userGuess = 0

    while (userGuess != numberToGuess) {
        try {
            userGuess = readLine()?.toInt() ?: 0

            if (userGuess !in 1..9) {
                println("Введите число от 1 до 9")
                userGuess = 0
            } else if (userGuess != numberToGuess) {
                println("неправильно")
            }
        } catch (e: NumberFormatException) {
            println("введите число.")
            userGuess = 0
        }
    }

    println("правильно")
}