package org.example

import kotlinx.coroutines.*
import kotlin.system.measureTimeMillis

suspend fun <T> withTimeoutFunction(block: suspend () -> T): T? {
    return try {
        withTimeout(1000L) {
            block()
        }
    } catch (e: TimeoutCancellationException) {
        println("Too long body execution")
        null
    }
}


fun main() = runBlocking {
    val time1 = measureTimeMillis {
        val result = withTimeoutFunction {
            delay(500L)
            "Hello"
        }
        println(result)
    }
    println(time1)

    val time2 = measureTimeMillis {
        val result = withTimeoutFunction {
            delay(1500L)
            "Hello"
        }
        println(result)
    }
    println(time2)
}