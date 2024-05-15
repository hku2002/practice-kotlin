package com.booking.api.common.config

import com.booking.api.common.dto.JwtToken
import io.jsonwebtoken.Jwts
import io.jsonwebtoken.SignatureAlgorithm
import io.jsonwebtoken.io.Decoders
import io.jsonwebtoken.security.Keys
import org.springframework.beans.factory.annotation.Value
import org.springframework.context.annotation.Configuration
import org.springframework.security.core.Authentication
import org.springframework.security.core.GrantedAuthority
import java.util.*

const val EXPIRE_TIME_MILLISECONDS: Long = 1000 * 60 * 30

@Configuration
class JwtTokenProvider {

    @Value("jwt.secret")
    lateinit var secretKey: String

    private val key by lazy { Keys.hmacShaKeyFor(Decoders.BASE64.decode(secretKey)) }


    fun createToken(authentication: Authentication): JwtToken {
        val authorities: String = authentication
            .authorities
            .joinToString(",", transform = GrantedAuthority::getAuthority)

        val now = Date()
        val accessExpiration = Date(now.time+ EXPIRE_TIME_MILLISECONDS)
        val accessToken = Jwts.builder()
            .subject(authentication.name)
            .claim("auth", authorities)
            .issuedAt(now)
            .expiration(accessExpiration)
            .signWith(key, SignatureAlgorithm.HS512)
            .compact()

        return JwtToken("Bearer", accessToken)
    }

}
