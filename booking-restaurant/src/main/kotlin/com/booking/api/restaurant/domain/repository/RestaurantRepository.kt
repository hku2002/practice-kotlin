package com.booking.api.restaurant.domain.repository

import com.booking.api.restaurant.domain.entity.Restaurant
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface RestaurantRepository : JpaRepository<Restaurant, Long> {
}
