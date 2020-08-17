package kr.co.tjoeun.lifecycle_200817

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.os.Looper

class SplashActivity : BaseActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)
    }

    override fun setUpEvents() {

    }

    override fun setValues() {

//        2.5(2500ms)초는 로딩화면을 보여주고 나서 메인으로 이동하고 싶다.

        val myHandler = Handler(Looper.getMainLooper())

        myHandler.postDelayed({
//            일정 시간이 지난 후에 실행시키고자 하는 코드 작성
    //        Splash 화면 => 메인 화면으로 (자동으로) 이동해야 함.

            val myIntent = Intent(mContext, MainActivity::class.java)
            startActivity(myIntent)

//        메인 화면으로 이동한 후에는 종료
            finish()

        }, 2500)



    }


}