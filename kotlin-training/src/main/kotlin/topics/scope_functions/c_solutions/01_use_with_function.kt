package topics.scope_functions.c_solutions

// Решение: использование with
fun main() {
    val result: String = with("Hello, ") {
        this + "Alice!"
    }
    println(result) // Hello, Alice!
}