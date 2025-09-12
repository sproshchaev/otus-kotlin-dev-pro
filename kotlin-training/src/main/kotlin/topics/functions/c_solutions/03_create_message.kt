package topics.functions.c_solutions

// Решение: Напишите функцию createMessage(name: String, prefix: String = "Mr.", suffix: String = "")
// которая возвращает строку типа "Hello Mr. John".
// Вызовите её с разными вариантами.

fun createMessage(name: String, prefix: String = "Mr.", suffix: String = ""): String {
    return "Hello $prefix. $name$suffix"
}

fun main() {
    // Примеры вызовов:
    println(createMessage("John"))
    println(createMessage("Anna", "Mrs."))
    println(createMessage("Smith", "", " Jr."))
}