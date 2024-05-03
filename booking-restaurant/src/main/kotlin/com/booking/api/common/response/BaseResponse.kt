package com.booking.api.common.response

import lombok.Getter

@Getter
class BaseResponse<T> {
    private val status: Int
    private val data: T

    constructor(status: Int, data: T) {
        this.status = status
        this.data = data
    }

    constructor(data: T) {
        status = 200
        this.data = data
    }
}
