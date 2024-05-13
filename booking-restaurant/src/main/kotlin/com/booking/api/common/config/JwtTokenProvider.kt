package com.booking.api.common.config

import com.booking.api.common.dto.JwtToken
import org.springframework.beans.factory.annotation.Value
import org.springframework.context.annotation.Configuration
import org.springframework.security.core.Authentication

const val EXPIRE_TIME_MILLISECONDS: Long = 1000 * 60 * 30

@Configuration
class JwtTokenProvider {

    @Value("jwt.secret")
    lateinit var secretKey: String


    fun createToken(authentication: Authentication): JwtToken {
        return JwtToken("", "")
    }

}
