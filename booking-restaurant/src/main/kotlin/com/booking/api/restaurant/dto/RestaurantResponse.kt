package com.booking.api.restaurant.dto

import com.booking.api.restaurant.domain.entity.Restaurant


class RestaurantResponse (
        val id: Long,
        val name: String,
        val address: String,
        val telNumber: String) {
    companion object {
        fun of(restaurant: Restaurant): RestaurantResponse {
            return RestaurantResponse(
                    id = restaurant.id,
                    name = restaurant.name,
                    address = restaurant.address,
                    telNumber = restaurant.telNumber
            )
        }

        fun of(restaurants: List<Restaurant>): List<RestaurantResponse> {
            return restaurants.stream()
                    .map { restaurant: Restaurant -> of(restaurant) }
                    .toList()
        }
    }
}
