package topics.scope_functions.c_solutions

// Решение: использование also
val numbers = listOf(1, 2, 3).also {
    println("List size: ${it.size}")
}

fun main() {
    println(numbers) // [1, 2, 3]
}