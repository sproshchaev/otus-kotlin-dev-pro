package topics.generics.b_tasks

// Задание: Создайте функцию safeToString<T: Any>(obj: T): String,
// которая возвращает строковое представление объекта.
// Используйте ограничение T: Any, чтобы запретить null.

fun <T: Any> safeToString(obj: T): String = TODO()

fun main() {
    println(safeToString("Hello"))
    println(safeToString(42))
    // safeToString(null) // Ошибка компиляции!
}