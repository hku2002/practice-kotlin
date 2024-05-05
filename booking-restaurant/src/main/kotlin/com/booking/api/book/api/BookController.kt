package com.booking.api.book.api

import com.booking.api.book.application.BookService
import com.booking.api.book.dto.RestaurantBooksResponse
import com.booking.api.common.response.BaseResponse
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/book")
class BookController(
        private val bookService: BookService
) {

    @GetMapping("/restaurants/{id}")
    fun findBooksFromRestaurant(@PathVariable id: Long): BaseResponse<List<RestaurantBooksResponse>> {
        return BaseResponse(bookService.findBooksFromRestaurant(restaurantId = id))
    }

}