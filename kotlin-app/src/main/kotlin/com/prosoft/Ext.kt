package com.prosoft

fun user(init: UserBuilder.() -> Unit): User {
    return UserBuilder().apply(init).build()
}