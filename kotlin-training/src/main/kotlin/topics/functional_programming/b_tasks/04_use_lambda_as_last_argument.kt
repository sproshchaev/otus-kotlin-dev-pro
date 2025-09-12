package topics.functional_programming.b_tasks

// Задание: Создайте функцию `echo`, которая принимает лямбду и два параметра,
// и вызывает лямбду с этими параметрами.
// Вынесите лямбду за скобки.

fun echo(
    sayIt: (String, Int) -> String,
    name: String,
    age: Int
): String = TODO("Реализуйте функцию echo")

fun main() {
    val result = echo({ name, age -> "Hello, $name ($age)" }, "Alice", 33)
    println(result) // Hello, Alice (33)
}