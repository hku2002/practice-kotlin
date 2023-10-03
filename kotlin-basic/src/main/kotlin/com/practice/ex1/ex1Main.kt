package com.practice.ex1

fun main() {

    // var 은 가변이다.
    var number1 = 10L
    println(number1)

    number1 = 20L
    println(number1)

    // val 은 불변이다.
    val number2 = 20L
    println(number2)

    // null 을 변수에 넣으려면 타입과 ?을 사용해야 한다.
    var number3: Long? = null
    println(number3)
    number3 = 30L;
    println(number3)
    val sampleNumber: Long? = null
    println(sampleNumber)
    
}
