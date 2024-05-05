package com.booking.api.book.dto

import com.booking.api.book.domain.entity.RestaurantBookTime
import java.time.LocalDateTime

class RestaurantBooksResponse(
        val bookTime: LocalDateTime,
        val isBooked: Boolean = false
) {
    companion object {
        fun of(restaurantBookTime: RestaurantBookTime): RestaurantBooksResponse {
            return RestaurantBooksResponse(
                    bookTime = restaurantBookTime.bookTime,
                    isBooked = restaurantBookTime.isBooked
            )
        }

        fun of(restaurantBookTimes: List<RestaurantBookTime>): List<RestaurantBooksResponse> {
            return restaurantBookTimes.stream()
                    .map { restaurantBookTime: RestaurantBookTime -> of(restaurantBookTime) }
                    .toList();
        }
    }
}
