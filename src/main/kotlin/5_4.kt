package org.example

fun main() {
    println(countWords("ТЕст  ,  тест; теСт тест   .тест тест ;  test."))
}

fun countWords(input: String): Int {
    val words = input.split(*arrayOf(" ", ",", ";", ".")).filter { it.isNotBlank() }
    return words.size
}