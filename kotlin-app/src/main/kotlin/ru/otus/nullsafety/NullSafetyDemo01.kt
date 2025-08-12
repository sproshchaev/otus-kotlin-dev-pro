package ru.otus.nullsafety

/**
 * 01. Nullable и Non-nullable типы
 */
fun main() {
    // Non-nullable тип - не может быть null
    var name: String = "Анна"
    // name = null // ❌ Ошибка компиляции

    // Nullable тип - может быть null
    var nullableName: String? = "Анна"
    nullableName = null // ✅ Разрешено
}