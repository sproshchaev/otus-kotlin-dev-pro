package topics.scope_functions.b_tasks

// Раскомменти́руйте строки: 14.
// До выполнения задания функция будет завершаться с ошибкой: finished with non-zero exit value 1

// Задание: Создайте объект Person с помощью apply.
// Установите имя "Bob" и возраст 30.

// Функция должна завершаться без ошибки.

data class Person(var name: String, var age: Int)

val person = Person("", 0).apply {
    // TODO("Установите имя и возраст")
}

fun main() {
    println(person.name) // Bob
    println(person.age)  // 30
}

// finished with non-zero exit value 1