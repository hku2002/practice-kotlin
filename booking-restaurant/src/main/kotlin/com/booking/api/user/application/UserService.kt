package com.booking.api.user.application

import com.booking.api.user.domain.entity.User
import com.booking.api.user.domain.repository.UserRepository
import com.booking.api.user.dto.UserJoinRequest
import org.springframework.stereotype.Service


@Service
class UserService(
    private val userRepository: UserRepository
) {

    fun join(userJoinRequest: UserJoinRequest): String {
        userRepository.save(User.of(userJoinRequest))
        return "success";
    }
}
