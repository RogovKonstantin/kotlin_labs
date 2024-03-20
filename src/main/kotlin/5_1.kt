package org.example

fun main() {
    println(formatNumber(1272))
    println(formatNumber(872))
    println(formatNumber(-1272))
    println(formatNumber(-872))
}

fun formatNumber(number: Int): String {
    return if (Math.abs(number) >= 1000) {
        "${number / 1000}K"
    } else {
        number.toString()
    }
}