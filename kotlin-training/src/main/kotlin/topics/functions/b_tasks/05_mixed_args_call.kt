package topics.functions.b_tasks

// Задание: Напишите функцию configureUser(name: String, age: Int = 18, isAdmin: Boolean = false)
// Вызовите её двумя способами:
// 1. Только позиционно
// 2. С именованными аргументами

// Функция должна завершаться без ошибки.

fun configureUser(name: String, age: Int = 18, isAdmin: Boolean = false) {
    println("User: $name, Age: $age, Admin: $isAdmin")
}

fun main() {
    // Ваш код здесь
}