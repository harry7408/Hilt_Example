package com.choi.fastcampus.hilt.practice

import android.app.Application
import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.choi.fastcampus.hilt.practice.ui.theme.Func
import com.choi.fastcampus.hilt.practice.ui.theme.Opt
import com.choi.fastcampus.hilt.practice.ui.theme.PracticeTheme
import com.choi.fastcampus.hilt.practice.ui.theme.Temp
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject
@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    // 필드 주입
    @Inject
    lateinit var func: Func
    // 필드 주입
    @Inject
    lateinit var temp: Temp

    lateinit var opt: Opt

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // func이 주입 되었는지 확인
        assert(this::func.isInitialized)
        assert(this::temp.isInitialized)

        // 생성자 바인딩을 통해 주입된 의존성 확인
        assert(func.temp!=null)

        // 메서드 주입이 잘 되었는지 확인
        assert(this::opt.isInitialized)
        setContent {
            PracticeTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Greeting("Hello")
                }
            }
        }
    }
    @Inject
    fun injectOpt(opt:Opt) {
        this.opt=opt
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    PracticeTheme {
        Greeting("Android")
    }
}