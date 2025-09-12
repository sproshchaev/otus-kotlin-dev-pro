package topics.functional_programming.c_solutions

// Решение: лямбда с типом
val sum: (Int, Int) -> Int = { a, b -> a + b }

fun main() {
    println(sum(3, 5)) // 8
}