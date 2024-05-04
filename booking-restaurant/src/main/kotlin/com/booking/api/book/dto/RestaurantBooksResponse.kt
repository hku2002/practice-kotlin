package com.booking.api.book.dto

import java.time.LocalDateTime

class RestaurantBooksResponse(
        val bookTime: LocalDateTime,
        val isBooked: Boolean = false
)
