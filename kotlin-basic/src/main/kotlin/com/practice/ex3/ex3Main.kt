package com.practice.ex3

import com.practice.ex2.Person

fun main() {
    val number1 = 3
    //val number2: Long = number1  <-- 암시적으로 변환 불가
    val number2: Long = number1.toLong();
    println(number1 + number2)
}

fun printAgeIfPerson(obj: Any) {
    if (obj is Person) {
        println(obj.name)
    }
}
