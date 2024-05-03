package com.booking.api.restaurant.application

import com.booking.api.restaurant.domain.repository.RestaurantRepository
import com.booking.api.restaurant.dto.RestaurantResponse
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional


@Service
@Transactional(readOnly = true)
class RestaurantService(
        private val restaurantRepository: RestaurantRepository
) {
    fun findRestaurants() : List<RestaurantResponse> {
        val restaurant = restaurantRepository.findAll()
        return RestaurantResponse.of(restaurant)
    }
}
