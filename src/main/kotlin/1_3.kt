package org.example

fun main() {
    val number = readln()
    if (number.length != 4) {
        throw IllegalArgumentException("число должно содержать 4 цифры")
    }
    val digits = number.map { it }.joinToString(", ")
    println(digits)
}
//5934