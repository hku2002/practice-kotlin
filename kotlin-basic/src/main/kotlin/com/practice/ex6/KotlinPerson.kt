package com.practice.ex6

fun main() {
    val person = KotlinPerson("코니", 30)
    println(person.name)
    println(person.age)
    person.age = 31
    println(person.age)
}

class KotlinPerson(
    val name: String,
    var age: Int
)
