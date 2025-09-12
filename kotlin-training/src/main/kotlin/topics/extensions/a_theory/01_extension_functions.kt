package topics.extensions.a_theory

// Расширения для чисел
fun Int.toCustomString() = "This is integer $this"
fun Double.toCustomString() = "This is double $this"
fun Int.toLong(): String = "Convert int to Long"

// Расширение для Any?
fun Any?.toCustomString(): String {
    return if (this == null) {
        "Nothing to return"
    } else {
        "$this this is custom string"
    }
}

fun main() {
    println(10.toCustomString()) // This is integer 10
    println(10.toLong())         // Convert int to Long
    println(10.3.toCustomString()) // This is double 10.3
    println(null.toCustomString()) // Nothing to return
}