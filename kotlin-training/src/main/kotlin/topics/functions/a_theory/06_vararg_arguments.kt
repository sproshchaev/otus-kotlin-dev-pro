package topics.functions.a_theory

// vararg - переменное количество аргументов
fun printNames(vararg names: String) {
    for (name in names) {
        println(name)
    }
}

fun main() {
    printNames("Alice", "Bob", "Charlie")

    val nameList = arrayOf("David", "Eve")
    printNames(*nameList) // распаковка массива

    printNames("Frank") // один аргумент тоже работает
}