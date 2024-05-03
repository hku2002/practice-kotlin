package com.booking.api.restaurant.api

import com.booking.api.common.response.BaseResponse
import com.booking.api.restaurant.application.RestaurantService
import com.booking.api.restaurant.dto.RestaurantResponse
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/restaurants")
class RestaurantController(
        private val restaurantService: RestaurantService
) {

    @GetMapping
    fun findRestaurants(): BaseResponse<List<RestaurantResponse>> {
        return BaseResponse(restaurantService.findRestaurants())
    }

}
