package org.example

fun main() {
    val list = mutableListOf<Int>()

    list.addAll(listOf(8, 21, 5, 90, 11, 0))

    list.add(0, 90)

    list.removeAt(4)

    list.add(-35)
    println(list)
}