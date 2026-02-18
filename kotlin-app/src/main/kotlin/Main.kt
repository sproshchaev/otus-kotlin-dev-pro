package com.prosoft

/**
 * Почему все переходят на Kotlin (18-02-2026)
 */

data class Person(val name: String, val age: Int)

fun main() {
    println("Hello, Kotlin!")

    val person1 = Person("Alice", 29)
    println("${person1.name}, ${person1.age}") // Alice, 29

    val person2 = Person("Bob", 30)
    println("${person2.name}, ${person2.age}") // Bob, 30

    println(person1 == person2) // false

    // Деструктуризация
    val (name, age) = person1
    println("Имя: $name, Возраст: $age") // Имя: Alice, Возраст: 29

    // Использование в циклах
    val peoples = listOf(person1, person2)

    for ((name, age) in peoples) {
        println("$name имеет возраст $age лет")
    }

    // when
    print("Введите номер дня недели (1-7):")

    val  day = readlnOrNull()?.toIntOrNull()

    val dayName = when (day) {
        1 -> "Понедельник"
        2 -> "Вторник"
        // ...
        else -> "Неверный день"
    }

    println("День недели: $dayName")

}