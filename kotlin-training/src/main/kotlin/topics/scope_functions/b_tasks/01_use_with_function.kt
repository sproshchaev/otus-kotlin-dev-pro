package topics.scope_functions.b_tasks

// Задание: Используйте функцию `with` для создания строки "Hello, Alice!"
// Используйте строку "Hello, " как receiver.

fun main() {
    val result: String = with("Hello, ") {
        TODO("Добавьте 'Alice!' к строке")
    }
    println(result) // Hello, Alice!
}

// finished with non-zero exit value 1