package com.booking.api

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class BookingRestaurantApplication

fun main(args: Array<String>) {
    runApplication<BookingRestaurantApplication>(*args)
}
