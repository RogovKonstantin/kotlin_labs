package org.example

import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)
    println("Введите значение экспорта:")
    val export = scanner.nextInt()
    println("Введите значение импорта:")
    val import = scanner.nextInt()

    val balance = export - import

    if (balance > 0) {
        println("Ваша прибыль составила: $balance")
    } else if (balance < 0) {
        println("Ваши убытки составили: ${-balance}")
    } else {
        println("Нет ни прибыли, ни убытков")
    }
}