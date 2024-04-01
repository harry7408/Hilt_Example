package com.choi.fastcampus.hilt.practice

import javax.inject.Inject

// AppModule에서 @Provides로 바인딩을 제공한다면
// 생성자 바인딩 부분이 빠져도 된다
class Example @Inject constructor() {
    override fun toString(): String {
        return "Example"
    }
}