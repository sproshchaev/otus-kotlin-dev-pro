package ru.otus.nullsafety

/**
 * 08. Функции с nullable параметрами
 */

// Функция принимает nullable параметр
fun greetPerson(name: String?) {
    val greeting = name?.let { "Привет, $it!" } ?: "Привет, незнакомец!"
    println(greeting)
}

fun main() {
    greetPerson("Анна")  // Привет, Анна!
    greetPerson(null)    // Привет, незнакомец!
}