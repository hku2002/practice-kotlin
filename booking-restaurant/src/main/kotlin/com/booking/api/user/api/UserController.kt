package com.booking.api.user.api

import com.booking.api.common.response.BaseResponse
import com.booking.api.user.application.UserService
import com.booking.api.user.dto.UserJoinRequest
import io.swagger.v3.oas.annotations.Operation
import io.swagger.v3.oas.annotations.media.ArraySchema
import io.swagger.v3.oas.annotations.media.Content
import io.swagger.v3.oas.annotations.media.Schema
import io.swagger.v3.oas.annotations.responses.ApiResponse
import io.swagger.v3.oas.annotations.responses.ApiResponses
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController


@RestController
@RequestMapping("/user")
class UserController(
    private val userService: UserService
) {

    @Operation(summary = "회원 가입", description = "회원 가입 API")
    @ApiResponses(value = [
        ApiResponse(responseCode = "200", description = "Success", content = [
            Content(mediaType = "application/json", array = ArraySchema(schema = Schema(implementation = String::class)))
        ])
    ])
    @PostMapping("/join")
    fun findRestaurants(userJoinRequest: UserJoinRequest): BaseResponse<String> {
        return BaseResponse(userService.join(userJoinRequest))
    }
}
