package topics.functions.c_solutions

// Решение: Напишите функцию add(a: Int, b: Int): Int, которая возвращает сумму.
// Вызовите её с a=3, b=5

fun add(a: Int, b: Int): Int = a + b

fun main() {
    val sum = add(3, 5)
    println("Сумма 3 и 5 равна: $sum") // Сумма 3 и 5 равна: 8
}