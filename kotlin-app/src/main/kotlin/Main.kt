package com.prosoft

/**
 * kotlin-app (gradle)
 */
fun main() {

    val user = user {
        "name" to "John Doe"
        "age" to 30
        "email" to "j.doe@mail.com"
    }

    println(user)

    val user2 = user {
        name = "John Doe"
        age = 30
        email = "j.doe@mail.com"
    }

    println(user2)

    val (userName, age, email) = user

    // Name: John Doe, Age: 30, Email: j.doe@mail.com
    println("Name: $userName, Age: $age, Email: $email")

    println("User name: ${user["name"]}")
    user["email"] = "new@mail.com"

    // Updated email: new@mail.com
    println("Updated email: ${user["email"]}")

}