package topics.generics.a_theory

// Обобщённая функция: принимает любой тип
fun <T> oneElementList(arg: T): List<T> = listOf(arg)

// Пример использования
fun main() {
    val l1: List<String> = oneElementList("Hello")
    val l2: List<Int> = oneElementList(42)
    val l3: List<Double> = oneElementList(3.14)

    println(l1) // [Hello]
    println(l2) // [42]
    println(l3) // [3.14]
}