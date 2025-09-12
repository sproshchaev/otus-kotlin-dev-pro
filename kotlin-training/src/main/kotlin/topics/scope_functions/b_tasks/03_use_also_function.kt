package topics.scope_functions.b_tasks

// Задание: Создайте список чисел и используйте also для вывода сообщения.
// Сообщение должно содержать размер списка.

val numbers = listOf(1, 2, 3).also {
    TODO("Выведите сообщение о размере списка")
}

fun main() {
    println(numbers) // [1, 2, 3]
}

// finished with non-zero exit value 1