package topics.collections.c_solutions

// Решение: создание списка и карты
val numbers: List<Int> = listOf(1, 2, 3, 4, 5)
val map: Map<String, Int> = mapOf("A" to 1, "B" to 2, "C" to 3)

fun main() {
    println(numbers) // [1, 2, 3, 4, 5]
    println(map)     // {A=1, B=2, C=3}
}