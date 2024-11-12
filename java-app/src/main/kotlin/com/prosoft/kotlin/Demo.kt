package com.prosoft.kotlin

/**
 * Demo 12-11-2024 "Миграция с Java на Kotlin в Backend-разработке"
 */
fun main() {
    // throw NullPointerException()
    // val b: String? = null
    // val l = b!!.length

    // var - изменяемая
    // var nonNullStr: String = "abc"
    // nonNullStr = null
    // val - иммутабельная переменная
    // val len = nonNullStr.length
    // println("String: $nonNullStr, length=$len")

    // ? - мб null
    // var nullPossibleStr: String? = "abc"

    // if (nullPossibleStr != null) {
    //     val len = nullPossibleStr.length
    // }

    // val len = if (nullPossibleStr != null) {
    //     nullPossibleStr.length
    // } else {
    //     -1
    // }

    // println(len)

    // val nullPossibleStr: String? = "abc"
    // println(nullPossibleStr?.length)

    // val nullPossibleStr2: String? = null
    // println(nullPossibleStr2?.length)

    // val nonNullStr: String = "abc"
    // println(nonNullStr.length)

    // val department = Department("Finance", Employee("Alice", null))
    // val bob = Employee("Bob", department)
    // val headName = bob?.department?.head?.name
    // println("Bob's boss $headName")

    // val list: List<String?> = listOf("1", "2", null)
    // for (item in list) {
    //     item?.let { println(item) }
    // }

    // val nullPossibleStr: String? = "abc" // null
    // val len: Int = if (nullPossibleStr != null) nullPossibleStr.length else -1
    // val len = nullPossibleStr?.length ?: -1
    //  println(len)

    // println(someFun(100))

    // val nullPossibleStr: String? = "abc" // null
    // val len = nullPossibleStr!!.length
    // println("length = $len")

    // val hello: String? = null
    // val message: String? = hello as? String
    // println(message)

    // val nullableList: List<Int?> = listOf(1, 2, null, 4)
    // val intList: List<Int> = nullableList.filterNotNull()
    // println(intList)

}

fun someFun(digit: Int?): String? {
    val v1 = digit ?: return null
    return ("$v1").toString()
}