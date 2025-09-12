package topics.extensions.a_theory

// Инфиксные функции
infix fun String.withNum(num: Int) = "$this with ($num)"

fun main() {
    val res = "My string" withNum 22
    println(res) // My string with (22)
}