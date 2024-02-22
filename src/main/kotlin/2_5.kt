package org.example


    fun main() {
        val num1: Int
        val num2: Int
        val num3: Int

        try {
            num1 = readLine()?.toInt() ?: 0
            num2 = readLine()?.toInt() ?: 0
            num3 = readLine()?.toInt() ?: 0
        } catch (e: NumberFormatException) {
            println("Ввод - целое число")
            return
        }

        if (num1 == num2 || num1 == num3 || num2 == num3) {
            println("Ошибка")
        } else {
            val average = (num1 + num2 + num3) / 3.0
            println("Среднее значение: $average")
        }
    }