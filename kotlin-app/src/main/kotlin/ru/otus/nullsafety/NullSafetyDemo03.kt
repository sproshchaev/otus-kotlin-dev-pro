package ru.otus.nullsafety

/**
 * 03. Оператор Elvis (Elvis Operator)
 */
data class Engine(val power: Int, val type: String)
data class Car(val brand: String, val engine: Engine?)

fun main() {
    val car: Car? = null

    // Elvis оператор ?:
    val brand = car?.brand ?: "Неизвестная марка"
    println(brand) // Неизвестная марка

    val engineType = car?.engine?.type ?: "Нет двигателя"
    println(engineType) // Нет двигателя

}