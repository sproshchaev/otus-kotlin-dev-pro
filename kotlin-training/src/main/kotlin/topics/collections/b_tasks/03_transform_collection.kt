package topics.collections.b_tasks

// Задание: Преобразуйте список чисел, умножив каждое число на 2.

fun main() {
    val numbers = listOf(1, 2, 3, 4, 5)
    val doubled = numbers.map { TODO("Умножьте число на 2") }

    println(doubled) // [2, 4, 6, 8, 10]
}