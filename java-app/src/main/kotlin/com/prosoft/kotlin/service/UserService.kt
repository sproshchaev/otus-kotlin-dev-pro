package com.prosoft.kotlin.service

import com.prosoft.kotlin.domain.User
import com.prosoft.kotlin.repository.UserRepository
import org.springframework.stereotype.Service

@Service("kotlinUserService")
class UserService(private val userRepository: UserRepository) {

    fun getUser(id: Long?): List<User> {
        return id?.let { userRepository.findById(it) }
            ?.let { listOf(it) }
            ?: emptyList()
    }

}