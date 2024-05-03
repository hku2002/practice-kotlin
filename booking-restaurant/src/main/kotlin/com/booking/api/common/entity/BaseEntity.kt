package com.booking.api.common.entity

import jakarta.persistence.Column
import jakarta.persistence.MappedSuperclass
import org.hibernate.annotations.CreationTimestamp
import org.hibernate.annotations.UpdateTimestamp
import java.time.LocalDateTime

@MappedSuperclass
open class BaseEntity(
        @CreationTimestamp
        @Column(name = "created_at", nullable = false)
        var createdAt: LocalDateTime = LocalDateTime.now(),

        @UpdateTimestamp
        @Column(name = "updated_at", insertable = false)
        var updatedAt: LocalDateTime? = null
)
