package ru.otus

import ru.otus.dataclass.Person

/**
 * kotlin-app (maven) 12-08-2025 Otus
 */
fun main() {
    val person = Person("Jhon", 15)
    val person2 = Person("Jhon", 15)

    println(person == person2)
}
