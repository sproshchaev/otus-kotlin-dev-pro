package topics.advanced_functions.c_solutions

// Решение: проверка типа с reified
inline fun <reified T> isOfType(obj: Any): Boolean = obj is T

fun main() {
    println(isOfType<Int>(1))           // true
    println(isOfType<String>("hello"))   // true
    println(isOfType<Double>(1))         // false
}