package topics.scope_functions.c_solutions

// Решение: использование run
fun main() {
    val result = "Hello, ".run {
        this + "Bob!"
    }
    println(result) // Hello, Bob!
}