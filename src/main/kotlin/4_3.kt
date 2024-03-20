package org.example

fun main() {
    val list = mutableListOf(24, -63, 67, -12, 88, 94, -28, 82, 0, 53)

    val min = list.minOrNull()
    val max = list.maxOrNull()

    println("Минимум: $min")
    println("Максимум: $max")
}