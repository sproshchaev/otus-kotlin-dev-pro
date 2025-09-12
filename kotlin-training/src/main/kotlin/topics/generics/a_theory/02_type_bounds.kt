package topics.generics.a_theory

// Ограничение типов: T должен быть подтипом Any
fun <T: Any> safeOneElementList(arg: T): List<T> = listOf(arg)

// Ошибка: нельзя передать null
// val l: List<String?> = safeOneElementList(null) // Ошибка компиляции!

// Но можно передать null, если тип позволяет
val l: List<String?> = safeOneElementList("test")

fun main() {
    val l1: List<String> = safeOneElementList("text")
    val l2: List<Int> = safeOneElementList(42)
    println(l1) // [text]
    println(l2) // [42]
}