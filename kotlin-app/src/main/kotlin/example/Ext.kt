package com.prosoft.example

fun user(init: UserBuilder.() -> Unit): User {
    return UserBuilder().apply(init).build()
}