package topics.generics.a_theory

// Потеря типов в рантайме
fun <T: Any> typedGeneric(arg: T) {
    println("Value: $arg")
    println("Runtime type: ${arg::class.simpleName}")
    println("But generic type T is erased at runtime")
}

fun main() {
    typedGeneric(1)           // Value: 1, Runtime type: Int
    typedGeneric("hello")     // Value: hello, Runtime type: String
    typedGeneric(listOf(1))   // Value: [1], Runtime type: ArrayList
}