package ru.otus.dataclass

/**
 * 04. Component функции
 */
fun main() {
    val person = Person("Анна", 25)

    // component1() возвращает первое свойство
    println(person.component1()) // Анна

    // component2() возвращает второе свойство
    println(person.component2()) // 25

    // Эти функции используются для деструктуризации
    val name = person.component1()
    val age = person.component2()
}