package com.practice.ex2

fun main() {

    val person = Person("홍길동")
    //startWithA(person.name) <- person 은 nullable 이므로 사용 불가
    // person 의 getName 이 @Nullable 이 없다면 NPE 가 발생할 수 있음

}

fun startWithA(str: String): Boolean {
    return str.startsWith("A")
}
