package org.example

import kotlinx.coroutines.*
import kotlin.random.Random
import kotlin.system.measureTimeMillis

suspend fun simpleTask(index: Int): Pair<Int, Boolean> {
    val randomNumber = Random.nextInt(0, 100)
    println("Корутина $index : $randomNumber")
    return Pair(index, randomNumber % 2 == 0)
}

fun main(): Unit = runBlocking {
    val results = HashMap<Int, Boolean>()
    val jobs = List(100000) {
        async {
            simpleTask(it).also { result ->
                results[result.first] = result.second
            }
        }
    }
    val executionTime = measureTimeMillis {
        jobs.awaitAll()
    }
    val successfulTasks = results.count { it.value }
    println("$successfulTasks задач выполнились с четным результатом за $executionTime мс.")
}
