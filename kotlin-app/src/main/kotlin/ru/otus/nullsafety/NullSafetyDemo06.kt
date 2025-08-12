package ru.otus.nullsafety

/**
 * 06. Let функция
 */
fun main() {
    val email: String? = "test@example.com" // или null

    // Выполняет блок только если значение не null
    email?.let {
        println("Отправляем письмо на: $it")
        // Дополнительная логика работы с email
    }

    // Цепочка let
    val result = email
        ?.trim()
        ?.uppercase()
        ?.let { if (it.isNotEmpty()) it else null }
    println("Результат цепочки let: $result")

}