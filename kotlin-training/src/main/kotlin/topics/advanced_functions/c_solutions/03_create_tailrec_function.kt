package topics.advanced_functions.c_solutions

// Решение: хвостовая рекурсия для суммы
tailrec fun sumTo(n: Int, acc: Int = 0): Int =
    if (n <= 0) acc else sumTo(n - 1, acc + n)

fun main() {
    println(sumTo(5)) // 15
}