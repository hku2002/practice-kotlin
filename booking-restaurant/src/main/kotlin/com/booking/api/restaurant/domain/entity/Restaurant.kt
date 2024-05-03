package com.booking.api.restaurant.domain.entity

import com.booking.api.common.entity.BaseEntity
import jakarta.persistence.*
import lombok.Getter

@Getter
@Entity
class Restaurant(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long,

    @Column(nullable = false)
    val name: String,

    @Column(nullable = false)
    val address: String,

    @Column(nullable = false)
    val telNumber: String
): BaseEntity()
