package ru.otus.`when`

/**
 * 03. Замена трудно читаемой if-else цепочки
 */
fun main() {
    print("Введите число: ")
    val x = readlnOrNull()?.toIntOrNull() ?: return

    when {
        x % 2 != 0 -> println("x нечетное")
        x % 2 == 0 -> println("x четное")
        x > 100 -> println("x больше 100")
        x < 0 -> println("x отрицательное")
        x == 0 -> println("x равно нулю")
        else -> println("x - положительное четное число от 1 до 100")
    }
}