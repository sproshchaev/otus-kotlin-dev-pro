package com.prosoft

/**
 * kotlin-demo (20-11-2025)
 */

class Person {
    var name: String = ""
    var age: Int = 0
}

fun main() {

    // object.apply {
    //   // Настройки или операции с объектом
    // }

    // Цепочка вызовов
    val person = Person().apply {
        name = "John"
        age = 25
    }.also {
        println("Person created: ${it.name}, ${it.age}")
    }

    println(person.name)
    println(person.age)

    val list = mutableListOf<String>().apply {
        add("Apple")
        add("Banana")
        add("Cherry")
    }

    // (4) Пример использования DSL

    // Создание User через DSL
    val user = user {
        "name" to "Jhon" // Используем infix "to"
        "age" to 30
        "email" to "john.doe@example.com"
    }

    println(user) // User(name=Jhon, age=30, email=john.doe@example.com)

    // Альтернативный способ с прямым присваиванием
    val user2 = user {
        name = "Richard Roe"
        age = 32
        email = "richard.roe@example.com"
    }

    println(user2) // User(name=Richard Roe, age=32, email=richard.roe@example.com)

    // Деструктуризация - извлечение полей из объекта в несколько переменных
    val(userName, userAge, userEmail) = user
    println("Name: $userName, Age: $userAge, Email: $userEmail")

    // Проверка get/set
    println("User name: ${user["name"]}") // получаем через get
    println("User age: ${user["age"]}")
    user["email"] = "new.email@example.com" // устанавливаем через set
    println("User email: ${user["email"]}")
}