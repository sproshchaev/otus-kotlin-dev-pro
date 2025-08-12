package ru.otus.nullsafety

/**
 * 09. Nullable в возвращаемых значениях
 */
fun main() {
    val person = findPersonById(5) // findPersonById(0)
    println("$person")

    val name = person?.name ?: "Не найден"
    println("$name")

}

fun findPersonById(id: Int): Person? {
    // Может вернуть Person или null
    return if (id > 0) Person("Максим", null) else null
}