package topics.functional_programming.c_solutions

// Решение: функция высшего порядка
fun applyOperation(num: Int, operation: (Int) -> Int): Int = operation(num)

fun main() {
    val result1 = applyOperation(10) { it * 2 }
    val result2 = applyOperation(10) { it + 5 }
    println(result1) // 20
    println(result2) // 15
}