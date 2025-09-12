package topics.extensions.c_solutions

// Решение: лямбда-расширение для заглавной буквы
val uppercaseFirst: String.() -> String = {
    if (isEmpty()) this else replaceFirstChar { it.uppercase() }
}

fun main() {
    println("hello".uppercaseFirst()) // Hello
}