package org.example

import kotlinx.coroutines.*
import java.text.SimpleDateFormat
import java.util.*

fun main(): Unit = runBlocking {
    launch {
        while (true) {
            delay(1000L)
            println(SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(Date(System.currentTimeMillis())))
        }
    }
}