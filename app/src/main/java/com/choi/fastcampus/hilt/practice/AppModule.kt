package com.choi.fastcampus.hilt.practice

import android.util.Log
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

// 모듈을 통한 Hilt 컴포넌트에 의존성 바인딩하는 기법
@Module
@InstallIn(SingletonComponent::class)
object AppModule {

    // Singleton 컴포넌트에 이 의존성을 바인딩 하겠다
    // Scope를 지정하여 동일 인스턴스 반환을 받고 싶다.
    // -> Application에서 찍은 Log와 MainAcitivity에서 화면에 찍힌 UUID가 동일한 것을 확인 가능하다
    @Provides
    @Singleton
    fun provideExample() : Example {
        Log.e("AppModule","provideExample 호출")
        return Example()
    }
}