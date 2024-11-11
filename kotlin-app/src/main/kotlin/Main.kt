package com.prosoft

/**
 * kotlin-app (gradle)
 */
fun main() {

    // (1) Явный вызов
    // throw NullPointerException()

    // (2)
    // val b: String? = null // создали ссылку на null
    // val l = b!!.length // пытаемся вызывать метод у null объекта при использовании !! принудительного преобразования значения к непустому типу

    // var nonNullStr: String = "abc"
    // nonNullStr = null

    // (3) В таком коде Гарантировано не будет NPE
    // val len = nonNullStr.length

    // (4) Выведем в консоль - пример интерполяции строк
    // println("String: $nonNullStr, length=$len")

    // ---
    // (1) Объявим переменную с возможностью принимать null: String?
    // var nullPossibleStr: String? = "abc"

    // (2) Присвоить null теперь возможно
    // nullPossibleStr = null

    // (3) В этом случае компилятор выдат ошибку, указав что м.б. null
    //val len = nullPossibleStr.length // раскомментировать и показать

    // (4) Как быть, если нам необходимо получить доступ к nullPossibleStr?
    // if (nullPossibleStr != null) {
    //    val len = nullPossibleStr.length
    // }

    // (3) Создадим "Департамент финансов" с руководителем Алисой
    // val department = Department("Finance", Employee("Alice", null))
    // (4) Создадим сотрудника по имени Боб, который работает у Алисы
    // val bob = Employee("Bob", department)
    // (5) Используем "Цепочку вызовов" для получения имени руководителя Боба
    // val headName = bob?.department?.head?.name
    // Напечатаем
    // println("Bob's boss: $headName")

    // (1) Создадим коллекцию из строк, в которую поместим null
    // val list: List<String?> = listOf("1", "2", null)
    // for (item in list) {
    //     item?.let { println(item) } // выводит "1" и "2" и игнорирует null
    // }

    // (1) Создадим null-able переменную
    // val nullPossibleStr: String? = "abc" // null

    // (2) Сначала напишем длинное выражение с использованием if
    // val len: Int = if (nullPossibleStr != null) nullPossibleStr.length else -1
    // println(len)

    // (3) Теперь напишем с Элвис-оператором (без if)
    // val len = nullPossibleStr?.length ?: -1
    // println(len)

    // val nullPossibleStr: String? = "abc" // null
    // val len = nullPossibleStr!!.length
    // println("len=$len")



}