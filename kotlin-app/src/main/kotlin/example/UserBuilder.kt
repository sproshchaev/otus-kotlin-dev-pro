package com.prosoft.example

class UserBuilder {
    var name: String = ""
    var age: Int = 0
    var email: String = ""

    infix fun String.to(value: Any) {
        when (this) {
            "name" -> name = value as String
            "age" -> age= value as Int
            "email" -> email = value as String
        }
    }

    fun build() = User(name, age, email)
}