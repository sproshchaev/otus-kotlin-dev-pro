package topics.scope_functions.c_solutions

// Решение: использование let
val text: String? = "Hello"

val result = text?.let {
    it + "!"
}

fun main() {
    println(result) // Hello!
}