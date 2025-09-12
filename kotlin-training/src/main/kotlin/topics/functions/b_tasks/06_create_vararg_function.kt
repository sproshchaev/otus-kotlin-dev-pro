package topics.functions.b_tasks

// Задание: Напишите функцию multiply(vararg numbers: Int), которая возвращает произведение всех чисел.
// Если нет чисел — вернуть 1.
// Вызовите её с разными наборами чисел.

fun multiply(vararg numbers: Int): Int = TODO()

fun main() {
    // Примеры:
    println(multiply(2, 3, 4))     // 24
    println(multiply(1, 2, 3, 4))  // 24
    println(multiply())                        // 1
    println(multiply(5))           // 5
}