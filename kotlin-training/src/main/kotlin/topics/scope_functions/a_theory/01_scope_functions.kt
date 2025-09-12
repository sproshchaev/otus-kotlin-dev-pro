package topics.scope_functions.a_theory

// Scope functions
inline fun <T, R> with(receiver: T, block: T.() -> R): R = receiver.block()

inline fun <T> T.apply(block: T.() -> Unit): T {
    block()
    return this
}

inline fun <T> T.also(block: (T) -> Unit): T {
    block(this)
    return this
}

inline fun <T, R> T.run(block: T.() -> R): R = block()

inline fun <T, R> T.let(block: (T) -> R): R = block(this)

fun main() {
    val result = with("445") { this + "6" }
    println(result) // 4456
}