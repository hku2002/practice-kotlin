package com.booking.api.book.domain.entity

import com.booking.api.common.entity.BaseEntity
import com.booking.api.restaurant.domain.entity.Restaurant
import jakarta.persistence.*
import java.time.LocalDateTime

@Entity
@Table(uniqueConstraints = [
    UniqueConstraint(name = "unq-restaurant-user-time", columnNames = ["restaurant_id", "book_time"])
])
class Book(
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        val id: Long,
        @ManyToOne(fetch = FetchType.LAZY)
        val restaurant: Restaurant,
        val userId: Long,
        val userName: String,
        val phoneNumber: Int,
        val bookTime: LocalDateTime
): BaseEntity()
