package org.example

fun main() {
    val num1 = readln().toInt()
    val num2 = readln().toInt()

    val areBothEven = if (num1 % 2 == 0 && num2 % 2 == 0) true else false

    println(areBothEven)
}