package org.example

import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)
    println("Введите значение потерь:")
    val loss = scanner.nextInt()
    println("Введите значение прибыли:")
    val profit = scanner.nextInt()

    val balance = loss - profit

    if (loss<profit) {
        println("Ваша прибыль составила: ${-balance}")
    } else if (loss>profit) {
        println("Ваши убытки составили: $balance")
    } else {
        println("Нет ни прибыли, ни убытков")
    }
}