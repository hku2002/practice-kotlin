package com.booking.api.user.domain.entity

import com.booking.api.common.entity.BaseEntity
import jakarta.persistence.*

@Entity
@Table(uniqueConstraints = [
    UniqueConstraint(name = "unq-phone_number", columnNames = ["phone_number"]),
    UniqueConstraint(name = "unq-email", columnNames = ["email"])
])
class User(
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        val id: Long,
        val email: String,
        val password: String,
        val userName: String,
        val phoneNumber: String,
): BaseEntity()
