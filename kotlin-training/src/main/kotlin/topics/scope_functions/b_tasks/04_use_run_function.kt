package topics.scope_functions.b_tasks

// Задание: Используйте run для создания строки "Hello, Bob!"
// Используйте строку "Hello, " как receiver.

fun main() {
    val result: String = "Hello, ".run {
        TODO("Добавьте 'Bob!'")
    }
    println(result) // Hello, Bob!
}