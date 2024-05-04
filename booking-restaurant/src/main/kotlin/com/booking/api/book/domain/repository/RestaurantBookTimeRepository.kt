package com.booking.api.book.domain.repository

import com.booking.api.book.domain.entity.RestaurantBookTime
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface RestaurantBookTimeRepository: JpaRepository<RestaurantBookTime, Long> {
    fun findAllByRestaurantId(id: Long): List<RestaurantBookTime>
}
