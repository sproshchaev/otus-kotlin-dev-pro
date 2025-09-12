package topics.functional_programming.c_solutions

// Решение: функция с лямбдой за скобками
fun echo(
    sayIt: (String, Int) -> String,
    name: String,
    age: Int
): String = sayIt(name, age)

fun main() {
    val result = echo({ name, age -> "Hello, $name ($age)" }, "Alice", 33)
    println(result) // Hello, Alice (33)
}