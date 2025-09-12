package topics.functions.b_tasks

// Задание:
// 1. Напишите функцию logMessage(msg: String): Unit, которая печатает сообщение
// 2. Напишите функцию throwError(): Nothing, которая бросает исключение
// 3. Попробуйте вызвать её в выражении с null-обработкой

fun logMessage(msg: String): Unit = TODO()

fun throwError(): Nothing = TODO()

fun main() {
    val data: String? = null
    val result: String = data ?: throwError()
    println(result)
}

// finished with non-zero exit value 1