package topics.generics.c_solutions

// Решение: обобщённая функция maxOf
fun <T: Comparable<T>> maxOf(a: T, b: T): T = if (a > b) a else b

fun main() {
    println(maxOf(1, 5))              // 5
    println(maxOf("apple", "banana")) // banana
}