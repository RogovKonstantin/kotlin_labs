package org.example

fun main() {
    val num: Int
    try {
        num = readln().toInt()
    } catch (e: NumberFormatException) {
        println("Ввод - целое число")
        return
    }
    val result = "$num${num * 2}"
    println(result)
}