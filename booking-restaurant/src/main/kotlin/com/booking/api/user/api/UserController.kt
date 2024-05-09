package com.booking.api.user.api

import com.booking.api.common.response.BaseResponse
import com.booking.api.user.application.UserService
import com.booking.api.user.dto.UserJoinRequest
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController


@RestController
@RequestMapping("/user")
class UserController(
    private val userService: UserService
) {

    @PostMapping("/join")
    fun findRestaurants(userJoinRequest: UserJoinRequest): BaseResponse<String> {
        return BaseResponse(userService.join(userJoinRequest))
    }
}
