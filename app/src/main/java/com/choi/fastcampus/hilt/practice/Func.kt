package com.choi.fastcampus.hilt.practice

import javax.inject.Inject

// 생성자 주입
class Func @Inject constructor(val temp: Temp) {
}