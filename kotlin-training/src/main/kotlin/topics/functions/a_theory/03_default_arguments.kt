package topics.functions.a_theory

fun greet(name: String, greeting: String = "Hello") {
    println("$greeting, $name!")
}

fun main() {
    greet("Alice")                     // Hello, Alice!
    greet("Bob", "Hi")       // Hi, Bob!
}