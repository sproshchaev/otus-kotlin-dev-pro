package topics.collections.c_solutions

// Решение: фильтрация и группировка
fun main() {
    val numbers = listOf(1, 2, 3, 4, 5)

    val evenNumbers = numbers.filter { it % 2 == 0 }
    val grouped = numbers.groupBy { it % 2 }

    println(evenNumbers) // [2, 4]
    println(grouped)     // {0=[2, 4], 1=[1, 3, 5]}
}