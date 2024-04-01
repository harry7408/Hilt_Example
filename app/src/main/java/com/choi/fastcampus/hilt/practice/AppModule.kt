package com.choi.fastcampus.hilt.practice

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

// 모듈을 통한 Hilt 컴포넌트에 의존성 바인딩하는 기법
@Module
@InstallIn(SingletonComponent::class)
object AppModule {

    // Singleton 컴포넌트에 이 의존성을 바인딩 하겠다
    @Provides
    fun provideExample() : Example {
        return Example()
    }
}