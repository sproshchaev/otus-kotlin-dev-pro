package ru.otus.`when`

/**
 * 01. Пример when. Вывод: День недели.
 */
fun main() {
    print("Введите номер дня недели (1-7): ")

    val day = readlnOrNull()?.toIntOrNull()

    val dayName = when (day) {
        1 -> "Понедельник"
        2 -> "Вторник"
        3 -> "Среда"
        4 -> "Четверг"
        5 -> "Пятница"
        6 -> "Суббота"
        7 -> "Воскресенье"
        else -> "Неверный день"
    }

    println("День недели: $dayName")
}