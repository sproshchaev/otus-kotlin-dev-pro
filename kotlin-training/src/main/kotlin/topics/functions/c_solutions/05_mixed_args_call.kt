package topics.functions.c_solutions

// Решение: Напишите функцию configureUser(name: String, age: Int = 18, isAdmin: Boolean = false)
// Вызовите её двумя способами:
// 1. Только позиционно
// 2. С именованными аргументами

fun configureUser(name: String, age: Int = 18, isAdmin: Boolean = false) {
    println("User: $name, Age: $age, Admin: $isAdmin")
}

fun main() {
    // 1. Вызов только позиционно
    configureUser("Alice", 25, true)
    configureUser("Bob", 30)        // isAdmin использует значение по умолчанию
    configureUser("Charlie")        // age и isAdmin используют значения по умолчанию

    println("---")

    // 2. Вызов с именованными аргументами
    configureUser(name = "David", age = 22, isAdmin = false)
    configureUser(name = "Eve", age = 28)           // isAdmin по умолчанию
    configureUser(name = "Frank")                   // age и isAdmin по умолчанию

    println("---")

    // 3. Смешанный вызов (позиционные + именованные)
    configureUser("Grace", age = 35, isAdmin = true)
    configureUser("Henry", isAdmin = false)         // age по умолчанию
}