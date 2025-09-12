// Именованные аргументы - простой пример
fun createUserProfile(
    name: String,
    age: Int = 18,
    city: String = "Unknown",
    isActive: Boolean = true
): String {
    return "User: $name, Age: $age, City: $city, Active: $isActive"
}

fun main() {
    // Позиционные аргументы
    println(createUserProfile("Alice", 25, "Moscow", true))

    // Именованные аргументы
    println(createUserProfile(
        name = "Bob",
        age = 30,
        city = "Saint Petersburg",
        isActive = false
    ))

    // Смешанные аргументы
    println(createUserProfile("Charlie", age = 22, isActive = true))
}