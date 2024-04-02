package com.choi.fastcampus.hilt.practice

import javax.inject.Inject
import java.util.UUID

// AppModule에서 @Provides로 바인딩을 제공한다면
// 생성자 바인딩 부분이 빠져도 된다
class Example @Inject constructor() {
    //  Binding에 Scope를 지정할 경우 동일 인스턴스가 주입되는지 확인하기 위한 UUID 설정
    private val uuid = UUID.randomUUID()

    override fun toString(): String {
        return uuid.toString()
    }
}