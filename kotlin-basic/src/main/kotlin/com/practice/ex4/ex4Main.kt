package com.practice.ex4

fun expressionSample(score: Int): String {
    // 코틀린의 if-else 는 expression 이기 때문에 아래와 같이 사용할 수 있다.
    return if (score >= 80) {
        "success";
    } else {
        "fail"
    }
}
