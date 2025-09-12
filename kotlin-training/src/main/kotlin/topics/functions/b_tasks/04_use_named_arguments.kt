package topics.functions.b_tasks

// Задание:
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
) {
    // TODO: Реализуйте функцию здесь
    TODO("Реализуйте функцию reformat")
}

fun main() {
    // Ваш вызов здесь
    reformat(
        str = "myNameIsKotlin",
        normalizeCase = false,
        upperCaseFirstLetter = false,
        divideByCamelHumps = true,
        wordSeparator = '_'
    )
}