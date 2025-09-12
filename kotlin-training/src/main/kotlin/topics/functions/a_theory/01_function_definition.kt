// Определение функции с параметром и возвратом значения
fun double(x: Int): Int {
    return x * x
}

// Функция без возвращаемого значения (Unit)
fun greet(name: String) {
    println("Hello, $name!")
}

// Вызов функций
fun main() {
    val result = double(4)
    println("Квадрат числа 4 равен: $result") // Квадрат числа 4 равен: 16

    greet("Kotlin") // Hello, Kotlin!
}