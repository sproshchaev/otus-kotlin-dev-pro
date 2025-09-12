package topics.collections.b_tasks

// Задание: Отфильтруйте четные числа и сгруппируйте по остатку от деления на 2.

fun main() {
    val numbers = listOf(1, 2, 3, 4, 5)

    val evenNumbers = numbers.filter { TODO("Проверьте, является ли число четным") }
    val grouped = numbers.groupBy { TODO("Верните остаток от деления на 2") }

    println(evenNumbers) // [2, 4]
    println(grouped)     // {0=[2, 4], 1=[1, 3, 5]}
}