package com.choi.fastcampus.hilt.practice

import android.app.Application
import android.util.Log
import dagger.hilt.android.HiltAndroidApp
import javax.inject.Inject

@HiltAndroidApp
class App : Application() {
    val tag=App::class.java.simpleName

    // Application이 Client가 되어 Singleton 컴포넌트에게 의존성 주입 요청
    @Inject
    lateinit var example: Example

    override fun onCreate() {
        // super.onCreate() 에서 의존성 주입이 발생한다
        super.onCreate()
        Log.e(tag,"Hello this is $example")
    }

}