package topics.generics.b_tasks

// Задание: Напишите обобщённую функцию maxOf<T>(a: T, b: T): T,
// которая возвращает больший из двух значений.
// Условие: T должен быть Comparable<T>

fun <T: Comparable<T>> maxOf(a: T, b: T): T = TODO()

fun main() {
    println(maxOf(1, 5))              // 5
    println(maxOf("apple", "banana")) // banana
}

// finished with non-zero exit value 1