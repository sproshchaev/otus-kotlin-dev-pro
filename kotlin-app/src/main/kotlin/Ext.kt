package com.prosoft

// Функция - расширение для создания User с DSL
fun user(init: UserBuilder.() -> Unit): User {
    return UserBuilder().apply(init).build()
}