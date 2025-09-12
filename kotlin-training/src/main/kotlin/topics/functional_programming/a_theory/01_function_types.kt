package topics.functional_programming.a_theory

// Типы функций
val greet: () -> Unit = { println("Hello!") }

val multiply: (Int, Int) -> Int = { a, b -> a * b }

val format: (String) -> String = { "Formatted: $it" }

fun main() {
    greet()
    println(multiply(2, 3)) // 6
    println(format("text")) // Formatted: text
}