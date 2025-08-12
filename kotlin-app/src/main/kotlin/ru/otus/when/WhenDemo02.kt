package ru.otus.`when`

/**
 * 02.
 */
fun main() {
    print("Введите номер дня недели (1-7): ")

    val day = readlnOrNull()?.toIntOrNull()

    when (day) {
        1, 2, 3, 4, 5 -> println("Рабочий день")
        6, 7 -> println("Выходной день")
        in 1..7 -> println("День недели (уже покрыт выше)")
        !in 1..7 -> println("Неверный день (должно быть от 1 до 7)")
        else -> println("Эта ветка никогда не выполнится")
    }
}