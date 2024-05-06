package com.booking.api.book.api

import com.booking.api.book.application.BookService
import com.booking.api.book.dto.RestaurantBooksResponse
import com.booking.api.common.response.BaseResponse
import com.booking.api.restaurant.dto.RestaurantResponse
import io.swagger.v3.oas.annotations.Operation
import io.swagger.v3.oas.annotations.media.ArraySchema
import io.swagger.v3.oas.annotations.media.Content
import io.swagger.v3.oas.annotations.media.Schema
import io.swagger.v3.oas.annotations.responses.ApiResponse
import io.swagger.v3.oas.annotations.responses.ApiResponses
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/book")
class BookController(
        private val bookService: BookService
) {

    @Operation(summary = "레스토랑 예약 목록 조회", description = "레스토랑 id로 예약 목록을 조회하는 API")
    @ApiResponses(value = [
        ApiResponse(responseCode = "200", description = "Success", content = [
            Content(mediaType = "application/json", array = ArraySchema(schema = Schema(implementation = RestaurantResponse::class)))
        ])
    ])
    @GetMapping("/restaurants/{id}")
    fun findBooksFromRestaurant(@PathVariable id: Long): BaseResponse<List<RestaurantBooksResponse>> {
        return BaseResponse(bookService.findBooksFromRestaurant(restaurantId = id))
    }

}
