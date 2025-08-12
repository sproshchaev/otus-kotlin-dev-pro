package ru.otus.nullsafety

/**
 * 02. Безопасные вызовы (Safe Calls)
 */
data class Address(val street: String, val city: String)
data class Person(val name: String, val address: Address?)

fun main() {

    val person: Person? = Person("Анна", Address("Ленина 1", "Москва"))

    // Безопасные вызовы с оператором "?." - это safe call operator (оператор безопасного вызова).
    // (иногда его также называют просто "оператор вопросительный знак-точка")
    val city = person?.address?.city
    println(city) // Москва или null

    // Без safe call было бы:
    // if (person != null && person.address != null) {
    //     println(person.address.city)
    // }

}
