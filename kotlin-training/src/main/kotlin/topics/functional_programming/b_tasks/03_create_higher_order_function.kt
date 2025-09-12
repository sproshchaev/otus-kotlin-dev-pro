package topics.functional_programming.b_tasks

// Задание: Создайте функцию `applyOperation`, которая принимает число и лямбду,
// и возвращает результат применения лямбды к числу.

fun applyOperation(num: Int, operation: (Int) -> Int): Int = TODO("Реализуйте функцию")

fun main() {
    val result1 = applyOperation(10) { it * 2 }
    val result2 = applyOperation(10) { it + 5 }
    println(result1) // 20
    println(result2) // 15
}

// finished with non-zero exit value 1