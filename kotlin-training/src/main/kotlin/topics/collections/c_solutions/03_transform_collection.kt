package topics.collections.c_solutions

// Решение: преобразование коллекции
fun main() {
    val numbers = listOf(1, 2, 3, 4, 5)
    val doubled = numbers.map { it * 2 }

    println(doubled) // [2, 4, 6, 8, 10]
}