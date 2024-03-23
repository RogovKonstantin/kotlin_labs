package org.example

fun main() {
    var sum = 0
    for (i in 4..100 step 4) {
        if (i % 4 == 0) {
            sum += i
        }
    }
    println(sum)
}