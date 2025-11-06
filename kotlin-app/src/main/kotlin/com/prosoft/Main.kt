package com.prosoft

/**
 * QA-Kotlin-2025-10 (06-11-2025)
 */
fun main() {

    // 1. Последовательности
    println("шаг1")
    println("шаг2")

    // 2. Функции
    val result = calc(5,10);

    /**
     * Комментарий
     * в несколько строк
     */

    // Сохраняем промежуточный результат
    val price = 100
    val tax = 20
    val total = price + tax
    println("Итого $total") // Итого 120

     // val total = 100 // Conflicting declarations:

    // Скоуп или Область видимости
    if (total >= 120) { //

        val total = 100
        val totalLocal = 150
        val message = "Дорого!"
        println(message)
    } //

    // println(totalLocal)

    // строгая типизация
    var age: Int = 25 //
    // age = "Двадцать пять" // Assignment type mismatch: actual type is 'kotlin.String', but 'kotlin.Int' was expected.
    age = 35

    // Явное или косвенное определение типов
    val name: String = "Анна" // Явно
    val count = 10 // Kotlin понимает что это Int

    // Pair - хранит 2 значения
    val person = Pair("Иван", 22) // создание структуры

    // Деструктурирование
    val (firstName, agePerson) = person

    println(firstName)
    println(agePerson)

    // _ Игнорирование ненужного значения
    val resultTotal = Pair(200, "OK")
    val (code, _) = resultTotal
    println(code) // 200

    // Triple

    // NPE
    // 1) Объявление nullable - переменной. Может быть null
    var userName: String? = null
    println("Имя пользователя $userName") // Имя пользователя null

    // 2) Базопасный вызов ?. - если null, то вернет null
    val length = userName?.length
    println("Длина имени $length")

    // 3) Небезопасный вызов !! - если null то ошибка (антипаттерн)
    // val length2 = userName!!.length // Ошибка userName = null // Exception in thread "main" java.lang.NullPointerException
    userName = "Анна"
    val length3 = userName!!.length
    println("Длина имени $length3") // Длина имени 4

    // 4) Elvis-оператор
    val userNull = null
    val displayName = userNull ?: "Гость"
    println("Имя гостя $displayName") // Имя гостя Гость


}

fun calc(a: Int, b: Int): Int {
    return a + b
}



