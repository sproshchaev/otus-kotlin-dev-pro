package com.prosoft.kotlin.repository

import com.prosoft.kotlin.domain.User
import org.springframework.stereotype.Repository

@Repository("kotlinUserRepository")
class UserRepository {

    private val users = mutableListOf(
        User(1L, "User1", "user1@kotlin.com"),
        User(2L, "User2", "user2@kotlin.com"),
        User(3L, "User3", "user3@kotlin.com")
    )

    fun findAll(): List<User> = users

    fun findById(id: Long): User? {
        return users.find { it.id == id }
    }

    fun save(user: User) {
        users.add(user)
    }

    fun deleteById(id: Long) {
        users.removeIf { it.id == id }
    }
}
