package org.example

fun main() {
    val sum = (5..57).filter { it != 34 && it != 46 && it != 52 }.sum()
    println(sum)
}