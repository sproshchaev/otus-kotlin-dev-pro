package com.prosoft.example

fun main() {

    val user = user {
        "name" to "John Doe"
        "age" to 30
        "email" to "john.doe@example.com"
    }

    println(user)

    val user2 = user {
        name = "Richard Roe"
        age = 32
        email = "richard.roe@example.com"
    }

    println(user2)

    val (userName, userAge, userEmail) = user
    println("Name: $userName, Age: $userAge, Email: $userEmail")

    println("User name: ${user["name"]}")
    user["email"] = "new.email@example.com"
    println("Updated email: ${user.email}")

}