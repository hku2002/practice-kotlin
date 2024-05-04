package com.booking.api.book.domain.entity

import com.booking.api.common.entity.BaseEntity
import jakarta.persistence.*
import java.time.LocalDateTime

@Entity
@Table(uniqueConstraints = [
        UniqueConstraint(name = "unq-restaurant-book_time", columnNames = ["restaurant_id", "book_time"])
])
class RestaurantBookTime(
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        val id: Long,
        @Column(nullable = false)
        val restaurantId: Long,
        @Column(nullable = false)
        val bookTime: LocalDateTime,
        @Column(nullable = false)
        val isBooked: Boolean = false
): BaseEntity()
