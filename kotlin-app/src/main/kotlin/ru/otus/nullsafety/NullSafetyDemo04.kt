package ru.otus.nullsafety

/**
 * 04. Оператор !! (Not-null assertion)
 * Используйте осторожно!
 */
fun main() {
    var name: String? = "Анна"

    // Утверждение, что значение не null
    val length = name!!.length // ✅ name не null

    name = null
    // val dangerous = name!!.length // ❌ Будет NullPointerException в runtime

}