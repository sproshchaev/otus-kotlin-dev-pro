package topics.functions.c_solutions

// Решение: функция isEven с выражением
fun isEven(x: Int): Boolean = x % 2 == 0

fun main() {
    println(isEven(4))   // true
    println(isEven(3))   // false
}