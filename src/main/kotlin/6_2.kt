package org.example
//Функция, возвращающая другую функцию в качестве результата
fun main() {
    val addFunction = calc('+')
    println(addFunction(4, 4))

    val multiplyFunction = calc('*')
    println(multiplyFunction(4, 4))
}

fun calc(operator: Char): (Int, Int) -> Int {
    return when (operator) {
        '+' -> { a, b -> a + b }
        '-' -> { a, b -> a - b }
        '*' -> { a, b -> a * b }
        '/' -> { a, b -> a / b }
        else -> throw IllegalArgumentException()
    }
}