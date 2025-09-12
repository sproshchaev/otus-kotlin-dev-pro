package topics.functions.c_solutions

// Решение:
// 1. Реализуйте функцию reformat, которая:
//    - принимает строку и параметры форматирования
//    - при divideByCamelHumps = true разделяет CamelCase слова указанным разделителем
//    - при normalizeCase = true приводит строку к нижнему регистру
//    - при upperCaseFirstLetter = true делает первую букву заглавной
// 2. Вызовите её с:
//   str = "myNameIsKotlin"
//   normalizeCase = false
//   upperCaseFirstLetter = false
//   divideByCamelHumps = true
//   wordSeparator = '_'

fun reformat(
    str: String,
    normalizeCase: Boolean = true,
    upperCaseFirstLetter: Boolean = true,
    divideByCamelHumps: Boolean = false,
    wordSeparator: Char = ' '
): String {
    var result = str

    // Нормализация регистра
    if (normalizeCase) {
        result = result.lowercase()
    }

    // Разделение по CamelCase
    if (divideByCamelHumps) {
        // Добавляем разделитель перед каждой заглавной буквой (кроме первой)
        result = result.replace(Regex("([a-z])([A-Z])"), "$1$wordSeparator$2")
    }

    // Приведение первой буквы к верхнему регистру
    if (upperCaseFirstLetter && result.isNotEmpty()) {
        result = result.replaceFirstChar { it.uppercase() }
    }

    return result
}

fun main() {
    // Ваш вызов здесь
    val result = reformat(
        str = "myNameIsKotlin",
        normalizeCase = false,
        upperCaseFirstLetter = false,
        divideByCamelHumps = true,
        wordSeparator = '_'
    )
    println(result) // my_name_is_kotlin
}