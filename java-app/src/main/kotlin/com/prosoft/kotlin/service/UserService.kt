package com.prosoft.kotlin.service

import com.prosoft.kotlin.domain.User
import com.prosoft.kotlin.repository.UserRepository
import org.springframework.stereotype.Service

@Service("kotlinUserService")
class UserService(private val userRepository: UserRepository) {

    /**
     * "id?.let {...}" - исп. безопасный вызов ?., чтобы проверить, что id не null, и только в этом случае выполнить поиск.
     * "userRepository.findById(it)" - ищем пользователя по id, результат — либо найденный пользователь, либо null.
     * "?.let { listOf(it) }" - если пользователь найден, оборачиваем его в список с помощью listOf.
     * "?: emptyList()" - если пользователя нет, возвращаем пустой список.
     */
    fun getUser(id: Long?): List<User> {
        return id?.let { userRepository.findById(it) }
            ?.let { listOf(it) }
            ?: emptyList()
    }

}