package org.example

import kotlinx.coroutines.async
import kotlinx.coroutines.runBlocking
import kotlinx.coroutines.delay


suspend fun complexMathOperation(param1: Int, param2: Int) {
    val iterations = 555555555
    var num = 0
    for (i in 0 until iterations) {
        num += param1 * param2 * (iterations * i / iterations) * (iterations * i / iterations)
    }
    delay(1000L)
    println(num)
}

fun main(): Unit = runBlocking {
    complexMathOperation(1020404, 5435345)
}