package com.booking.api.user.domain.entity

import com.booking.api.common.entity.BaseEntity
import com.booking.api.user.dto.UserJoinRequest
import jakarta.persistence.*

@Entity
@Table(
    name = "users",
    uniqueConstraints = [
    UniqueConstraint(name = "unq-phone_number", columnNames = ["phone_number"]),
    UniqueConstraint(name = "unq-email", columnNames = ["email"])
])
class User(
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        val id: Long?,
        val email: String,
        val password: String,
        val userName: String,
        val phoneNumber: String,
): BaseEntity() {
    companion object {
        fun of(request: UserJoinRequest): User {
            return User(
                id = null,
                email = request.email,
                password = request.password,
                userName = request.userName,
                phoneNumber = request.phoneNumber
            )
        }
    }
}
