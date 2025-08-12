package ru.otus.nullsafety

/**
 * 05. Проверка на null (Smart casts)
 */
fun main() {
    describeString("Abc")
    describeString(null)
}

fun describeString(str: String?) {
    // Явная проверка
    if (str != null) {
        // Компилятор автоматически приводит str к String (не nullable)
        println("Длина: ${str.length}") // str теперь String
        println("Верхний регистр: ${str.uppercase()}")
    } else {
        println("Строка null")
    }
}