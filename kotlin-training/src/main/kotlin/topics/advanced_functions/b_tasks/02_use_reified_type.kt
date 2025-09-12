package topics.advanced_functions.b_tasks

// Задание: Создайте функцию `isOfType<T>(obj: Any): Boolean`,
// которая проверяет, является ли объект типом T.
// Используйте `inline` и `reified`.

inline fun <reified T> isOfType(obj: Any): Boolean = TODO("Реализуйте функцию isOfType")

fun main() {
    println(isOfType<Int>(1))           // true
    println(isOfType<String>("hello"))   // true
    println(isOfType<Double>(1))         // false
}