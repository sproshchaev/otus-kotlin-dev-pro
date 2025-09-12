package topics.scope_functions.b_tasks

// Задание: Используйте let для безопасной работы с nullable.
// Если строка не null, добавьте "!" к ней.

val text: String? = "Hello"

val result = text?.let {
    TODO("Добавьте '!' к строке")
}

fun main() {
    println(result) // Hello!
}