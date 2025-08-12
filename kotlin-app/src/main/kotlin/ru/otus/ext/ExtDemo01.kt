package ru.otus.ext

/**
 * 01. Kotlin - extension function
 */
fun String.isPalindrome(): Boolean {
    return this.lowercase() == this.lowercase().reversed()
}

fun main() {
    // Использование
    val result1 = "level".isPalindrome()
    println(result1)

    val result2 = "hello".isPalindrome()
    println(result2)

    val result3 = "Madam".isPalindrome()
    println(result3) // (регистронезависимо)

    val result4 = "A man a plan a canal Panama".isPalindrome()
    println(result4) // (проверяет с пробелами)
}