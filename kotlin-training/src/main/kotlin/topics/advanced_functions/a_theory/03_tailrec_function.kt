package topics.advanced_functions.a_theory

// tailrec - хвостовая рекурсия
tailrec fun factorial(n: Int, acc: Int = 1): Int =
    if (n <= 1) acc else factorial(n - 1, n * acc)

fun main() {
    println(factorial(5)) // 120
}