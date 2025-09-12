package topics.scope_functions.c_solutions

// Решение: использование apply
data class Person(var name: String, var age: Int)

val person = Person("", 0).apply {
    name = "Bob"
    age = 30
}

fun main() {
    println(person.name) // Bob
    println(person.age)  // 30
}