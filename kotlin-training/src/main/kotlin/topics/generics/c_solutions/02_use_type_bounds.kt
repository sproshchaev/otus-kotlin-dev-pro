package topics.generics.c_solutions

// Решение: безопасное преобразование к строке
fun <T: Any> safeToString(obj: T): String = obj.toString()

fun main() {
    println(safeToString("Hello")) // Hello
    println(safeToString(42))       // 42
    // safeToString(null) // Ошибка компиляции!
}