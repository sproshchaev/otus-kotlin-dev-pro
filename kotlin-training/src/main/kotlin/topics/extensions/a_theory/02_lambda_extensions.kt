package topics.extensions.a_theory

// Лямбда-расширения
val greet: String.() -> Unit = { println("Hello, $this") }

val greetWithSurname: String.(String) -> Unit = { surname ->
    println("Hello, $this $surname")
}

fun main() {
    greet("Dee")
    "CoolGuy".greet()

    greetWithSurname("Ivan", "Gorky")
    "Ivan".greetWithSurname("Gorky")
}