package com.booking.api.book.domain.entity

import com.booking.api.common.entity.BaseEntity
import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id
import java.time.LocalDateTime

@Entity
class RestaurantBookTime(
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        val id: Long,
        val restaurant: Long,
        val bookTime: LocalDateTime,
): BaseEntity()
