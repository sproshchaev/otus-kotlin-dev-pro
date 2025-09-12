package topics.functions.c_solutions

// Решение: Unit и Nothing
fun logMessage(msg: String): Unit {
    println("LOG: $msg")
}

fun throwError(): Nothing = throw RuntimeException("No data!")

fun main() {
    val data: String? = null
    val result: String = data ?: throwError()
    println(result) // Ошибка времени выполнения
}

// ожидаемый результат — это ошибка выполнения (Process finished with non-zero exit value 1),
// вызванная необработанным RuntimeException.