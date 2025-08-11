package ru.otus.dataclass

/**
 * 05. Сравнение в data class и в обычном классе
 */
fun main() {
    // data class против обычного класса
    class RegularPerson(val name: String, val age: Int)

    data class DataPerson(val name: String, val age: Int)

    val regular1 = RegularPerson("Анна", 25)
    val regular2 = RegularPerson("Анна", 25)
    println(regular1 == regular2) // false (сравнение ссылок)

    val data1 = DataPerson("Анна", 25)
    val data2 = DataPerson("Анна", 25)
    println(data1 == data2) // true (сравнение содержимого)
}