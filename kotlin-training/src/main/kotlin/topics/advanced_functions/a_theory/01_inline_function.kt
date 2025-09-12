package topics.advanced_functions.a_theory

// inline - встраивание тела функции в место вызова
inline fun square(x: Int) = x * x

// Пример использования
fun main() {
    val result = square(4)
    println(result) // 16
}