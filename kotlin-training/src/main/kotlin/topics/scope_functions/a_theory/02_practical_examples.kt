package topics.scope_functions.a_theory

// Практические примеры
data class Person(var name: String, var age: Int)

fun main() {
    // with - работа с объектом в блоке
    val result = with("445") { this + "6" }

    // apply - инициализация объекта
    val person = Person("", 0).apply {
        name = "Alice"
        age = 33
    }

    // also - побочные эффекты
    val list = listOf(1, 2, 3).also { println("List created: $it") }

    // run - вычисление значения
    val result2 = "445".run { this + "6" }

    // let - безопасная работа с nullable
    val name: String? = "Alice"
    name?.let { println("Name is: $it") }

    println(result) // 4456
    println(person.name) // Alice
    println(list) // [1, 2, 3]
    println(result2) // 4456
}