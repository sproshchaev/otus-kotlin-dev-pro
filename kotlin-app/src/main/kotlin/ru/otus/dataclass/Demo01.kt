package ru.otus.dataclass

/**
 * 01. Автоматически сгенерированные методы в data class
 */
fun main() {

    // toString()
    val person = Person("Анна", 25)
    println(person)

    // equals() и hashCode()
    val person1 = Person("Анна", 25)
    val person2 = Person("Анна", 25)
    val person3 = Person("Борис", 30)

    println(person1 == person2) // true - содержимое одинаковое
    println(person1 == person3) // false - содержимое разное
    println(person1.hashCode() == person2.hashCode()) // true

}