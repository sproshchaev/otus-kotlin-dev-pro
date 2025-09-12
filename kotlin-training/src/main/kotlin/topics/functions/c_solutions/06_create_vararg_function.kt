package topics.functions.c_solutions

// Решение: функция multiply с vararg
fun multiply(vararg numbers: Int): Int {
    if (numbers.isEmpty()) return 1

    var result = 1
    for (num in numbers) {
        result *= num
    }
    return result
}

fun main() {
    println(multiply(2, 3, 4))     // 24
    println(multiply(1, 2, 3, 4))  // 24
    println(multiply())                        // 1
    println(multiply(5))           // 5
}