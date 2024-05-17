package org.example

import kotlinx.coroutines.*


suspend fun complexMathOperation(param1: Int, param2: Int): Long = coroutineScope {
    val iterations = 555555555
    var num: Long = 0
    for (i in 0 until iterations) {
        num += param1.toLong() * param2 * (iterations * i / iterations) * (iterations * i / iterations)
    }
    num
}

fun main(): Unit = runBlocking {
    println(complexMathOperation(1020404, 5435345))
}