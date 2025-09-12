package topics.functional_programming.a_theory

// Функции высшего порядка
fun processNumber(num: Int, operation: (Int) -> Int): Int = operation(num)

fun main() {
    val result1 = processNumber(10) { it * 2 }     // 20
    val result2 = processNumber(10) { it + 5 }     // 15
    println(result1)
    println(result2)
}