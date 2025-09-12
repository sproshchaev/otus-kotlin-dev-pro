package topics.scope_functions.b_tasks

// Задание: Создайте объект Person с помощью apply.
// Установите имя "Bob" и возраст 30.

data class Person(var name: String, var age: Int)

val person = Person("", 0).apply {
    TODO("Установите имя и возраст")
}

fun main() {
    println(person.name) // Bob
    println(person.age)  // 30
}

// finished with non-zero exit value 1