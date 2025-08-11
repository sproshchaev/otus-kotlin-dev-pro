package ru.otus.dataclass

/**
 * 03. Деструктуризация - извлечение данных из структуры (в переменные)
 */
fun main() {
    val person = Person("Анна", 25)

    // Деструктуризация в переменные
    val (name, age) = person
    println("Имя: $name, Возраст: $age") // Имя: Анна, Возраст: 25

    // Использование в циклах
    val people = listOf(
        Person("Анна", 25),
        Person("Борис", 30),
        Person("Виктор", 35)
    )

    for ((name, age) in people) {
        println("$name имеет возраст $age лет")
    }
}