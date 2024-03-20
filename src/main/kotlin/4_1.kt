package org.example

fun main() {
    val num1 = 5
    val num2 = 8

    val start = minOf(num1, num2)
    val end = maxOf(num1, num2)

    val list = (start..end).toList()

    println(list)
}