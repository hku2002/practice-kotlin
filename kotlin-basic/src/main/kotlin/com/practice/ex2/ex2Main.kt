package com.practice.ex2

fun main() {
    var str: String? = "ABC"
    println(str?.length)

    str = null
    println(str?.length ?: 0)
}

fun startsWithA1(str: String?): Boolean {
    if (str == null) {
        throw IllegalAccessException("null 예외 처리")
    }

    return str.startsWith("A")
}

fun startsWithA2(str: String?): Boolean? {
    if (str == null) {
        return null
    }

    return str.startsWith("A")
}

fun startsWithA3(str: String?): Boolean {
    if (str == null) {
        return false
    }

    return str.startsWith("A")
}

