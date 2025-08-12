package ru.otus.nullsafety

/**
 * 07. Работа с коллекциями
 */
fun main() {
    val names: List<String?> = listOf("Анна", null, "Борис", null, "Виктор")

    // Отфильтровать null значения
    val validNames = names.filterNotNull()
    println(validNames) // [Анна, Борис, Виктор]

    // Безопасная обработка каждого элемента
    names.forEach { name ->
        name?.let { println("Привет, $it") }
    }
}