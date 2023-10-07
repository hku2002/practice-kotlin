package com.practice.ex5

import java.lang.IllegalArgumentException
import java.lang.NumberFormatException

fun parseIntOrThrow(str: String): Int {
    try {
        return str.toInt();
    } catch (e: NumberFormatException) {
        throw IllegalArgumentException("주어진 문자열 $str 을 Int 로 변환하지 못했습니다.")
    }

}

fun parseIntOrThrowV2(str: String): Int? {
    return try {
        str.toInt()
    } catch (e: NumberFormatException) {
        null
    }
}
