package topics.functions.a_theory

// Возврат значения
fun square(x: Int): Int {
    return x * x
}

// Выражение-функция
fun cube(x: Int): Int = x * x * x

// Функция с when
fun classify(x: Int): String = when(x) {
    0 -> "Zero"
    in 1..10 -> "Small"
    else -> "Large"
}

// Тип Unit
fun greet(): Unit {
    println("Hello!")
}

// Неявно Unit
fun sayHi() {
    println("Hi!")
}

// Тип Nothing
fun reportError(): Nothing = throw RuntimeException("Something went wrong")

fun main() {
    println(square(4))           // 16
    println(cube(2))             // 8
    println(classify(5))         // Small
    greet()                          // Hello!
    sayHi()                          // Hi!
    // reportError()                 // Ошибка времени выполнения
}