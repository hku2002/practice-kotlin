package com.booking.api.restaurant.api

import com.booking.api.common.response.BaseResponse
import com.booking.api.restaurant.application.RestaurantService
import com.booking.api.restaurant.dto.RestaurantResponse
import io.swagger.v3.oas.annotations.Operation
import io.swagger.v3.oas.annotations.media.ArraySchema
import io.swagger.v3.oas.annotations.media.Content
import io.swagger.v3.oas.annotations.media.Schema
import io.swagger.v3.oas.annotations.responses.ApiResponse
import io.swagger.v3.oas.annotations.responses.ApiResponses
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/restaurants")
class RestaurantController(
        private val restaurantService: RestaurantService
) {

    @Operation(summary = "레스토랑 목록 조회", description = "레스토랑 전체 목록을 조회하는 API")
    @ApiResponses(value = [
        ApiResponse(responseCode = "200", description = "Success", content = [
            Content(mediaType = "application/json", array = ArraySchema(schema = Schema(implementation = RestaurantResponse::class)))
        ])
    ])
    @GetMapping
    fun findRestaurants(): BaseResponse<List<RestaurantResponse>> {
        return BaseResponse(restaurantService.findRestaurants())
    }

}
