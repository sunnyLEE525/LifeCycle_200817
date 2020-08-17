package kr.co.tjoeun.lifecycle_200817

import android.content.Intent
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setUpEvents()
        setValues()

        Log.d("메인화면","onCreate 실행됨")
    }

//    다른 화면에 갔다가 올 때마다 계속 실행됨.
    override fun onResume() {
        super.onResume()

        Log.d("메인화면", "OnResume 실행됨 - 화면이 나타남")
    }

    override fun onPause() {
        super.onPause()
        Log.d("메인화면", "onPause 실행됨 - 화면이 사라짐")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("메인화면", "onDestroy 실행됨 - 액티비티가 메모리에서 소멸됨")
    }

    override fun setUpEvents() {

        otherActivityBtn.setOnClickListener {
            val myIntent = Intent(mContext, OtherActivity::class.java)
            startActivity(myIntent)
        }

    }

    override fun setValues() {

    }


}