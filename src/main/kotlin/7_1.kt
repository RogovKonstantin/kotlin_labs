package org.example

import kotlinx.coroutines.*
import java.text.SimpleDateFormat
import java.util.*

fun main(): Unit = runBlocking {
    launch {
        while (true) {
            println(SimpleDateFormat("HH:mm:ss").format(Date(System.currentTimeMillis())))
            delay(1000L)
        }
    }
}