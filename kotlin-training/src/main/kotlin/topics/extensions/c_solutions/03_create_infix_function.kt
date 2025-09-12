package topics.extensions.c_solutions

// Решение: инфиксная функция
infix fun String.plusNum(num: Int): String = "$this ($num)"

fun main() {
    val result = "My string" plusNum 22
    println(result) // My string (22)
}