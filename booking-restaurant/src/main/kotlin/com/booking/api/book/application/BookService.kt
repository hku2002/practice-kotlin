package com.booking.api.book.application

import com.booking.api.book.domain.repository.BookRepository
import com.booking.api.book.domain.repository.RestaurantBookTimeRepository
import com.booking.api.book.dto.RestaurantBooksResponse
import org.springframework.stereotype.Service

@Service
class BookService(
        private val bookRepository: BookRepository,
        private val restaurantBookTimeRepository: RestaurantBookTimeRepository
) {

    fun findBooksFromRestaurant(restaurantId: Long): List<RestaurantBooksResponse> {
        val restaurantBookTimes = restaurantBookTimeRepository.findAllByRestaurantId(restaurantId)
        return RestaurantBooksResponse.of(restaurantBookTimes)
    }

}
