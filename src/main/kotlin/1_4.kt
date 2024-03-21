package org.example

fun main() {
    val numOfDays: Int
    try {
        numOfDays = readln().toInt()
    } catch (e: NumberFormatException) {
        println("Ввод - целое число")
        return
    }
    val years = numOfDays / 365
    val weeks = (numOfDays % 365) / 7
    val days = (numOfDays % 365) % 7
    println("Лет: $years, недель: $weeks, дней: $days")

}
//2642