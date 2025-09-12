package topics.extensions.b_tasks

// Задание: Создайте инфиксную функцию `String.plusNum(num: Int)`,
// которая добавляет число в скобках к строке.

infix fun String.plusNum(num: Int): String = TODO("Реализуйте инфиксную функцию")

fun main() {
    val result = "My string" plusNum 22
    println(result) // My string (22)
}

// finished with non-zero exit value 1