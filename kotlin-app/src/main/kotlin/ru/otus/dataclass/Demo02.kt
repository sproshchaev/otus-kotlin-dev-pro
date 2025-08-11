package ru.otus.dataclass

/**
 * 02. Функции копирования copy()
 */
fun main() {
    val original = Person("Анна", 25)

    // Копия с изменением одного поля
    val updatedAge = original.copy(age = 26)
    println(updatedAge) // Person(name=Анна, age=26)

    // Копия с изменением нескольких полей
    val completelyNew = original.copy(name = "Анна Петрова", age = 30)
    println(completelyNew) // Person(name=Анна Петрова, age=30)

    // Копия без изменений
    val same = original.copy()
    println(same) // Person(name=Анна, age=25)
}