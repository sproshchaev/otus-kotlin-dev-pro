package topics.functions.c_solutions

// Решение: Создайте функцию greet(name: String, greeting: String = "Hello"),
// которая выводит приветствие.
// Вызовите её с именем "Alice" и без второго аргумента.

fun greet(name: String, greeting: String = "Hello") {
    println("$greeting, $name!")
}

fun main() {
    greet("Alice")
    greet("Bob", "Hi")
}