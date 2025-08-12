package ru.otus.nullsafety

/**
 * Резюме: Операторы для работы с null
 */
fun main() {
    val text: String? = "Пример"

    // Также есть:
    val result1 = text ?: "По умолчанию"        // Elvis
    val result2 = text?.length                  // Safe call
    val result3 = text!!.length                 // Not-null assertion

    // Можно комбинировать:
    val processed = text
        ?.trim()
        ?.takeIf { it.isNotEmpty() }
        ?.lowercase()
        ?: "пусто"
}