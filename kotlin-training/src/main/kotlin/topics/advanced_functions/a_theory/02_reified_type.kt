package topics.advanced_functions.a_theory

// reified - доступ к типу в рантайме
inline fun <reified T: Any> printType(arg: T) {
    println("Argument type: ${arg::class.simpleName}")
    println("Generic type T: ${T::class}")
}

fun main() {
    printType(1)           // Argument type: Int, Generic type T: Int
    printType("hello")     // Argument type: String, Generic type T: String
}