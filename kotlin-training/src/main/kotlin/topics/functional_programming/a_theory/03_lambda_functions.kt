package topics.functional_programming.a_theory

// Лямбда-функции
val lambda = { println("Hello from lambda") }

val withArg = { str: String -> "My name is $str" }

val withType: (Int, Int) -> Int = { a, b -> a + b }

fun main() {
    lambda()
    println(withArg("Alice"))
    println(withType(1, 2))
}