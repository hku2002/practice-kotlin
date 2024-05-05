package com.booking.api.book.dto

import java.time.LocalDateTime

class BookRequest(
        val restaurantId: Long,
        var userId: Long,
        var userName: String,
        var phoneNumber: String,
        val bookTime: LocalDateTime
)
