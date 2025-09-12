package topics.collections.a_theory

// Операции с коллекциями
fun main() {
    val numbers = listOf(1, 2, 3, 4, 5)

    // Трансформации
    val doubled = numbers.map { it * 2 }
    val squared = numbers.map { it * it }
    val filtered = numbers.filter { it % 2 == 0 }
    val grouped = numbers.groupBy { it % 2 }

    // Агрегация
    val sum = numbers.sum()
    val average = numbers.average()
    val count = numbers.count()

    println("Original: $numbers")
    println("Doubled: $doubled")
    println("Squared: $squared")
    println("Filtered: $filtered")
    println("Grouped: $grouped")
    println("Sum: $sum")
    println("Average: $average")
    println("Count: $count")
}