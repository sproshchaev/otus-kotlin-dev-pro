package topics.generics.b_tasks

// Раскомменти́руйте строки: 12, 15-16.
// До выполнения задания функция будет завершаться с ошибкой: finished with non-zero exit value 1

// Задание: Создайте функцию safeToString<T: Any>(obj: T): String,
// которая возвращает строковое представление объекта.
// Используйте ограничение T: Any, чтобы запретить null.

// Функция должна завершаться без ошибки.

// fun <T: Any> safeToString(obj: T): String = TODO()

fun main() {
//    println(safeToString("Hello"))
//    println(safeToString(42))
    // safeToString(null) // Ошибка компиляции!
}
