package topics.collections.c_solutions

// Решение: агрегационные операции
fun main() {
    val numbers = listOf(1, 2, 3, 4, 5)

    val sum = numbers.sum()
    val average = numbers.average()
    val count = numbers.count()

    println(sum)      // 15
    println(average)  // 3.0
    println(count)    // 5
}