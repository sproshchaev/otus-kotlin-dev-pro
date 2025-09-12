package topics.functional_programming.c_solutions

// Решение: лямбда с использованием it
val printMessage: (String) -> Unit = { println(it) }

fun main() {
    printMessage("Hello, world!")
}