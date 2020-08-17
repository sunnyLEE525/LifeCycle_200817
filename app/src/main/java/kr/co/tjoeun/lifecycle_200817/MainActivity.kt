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

    override fun setUpEvents() {

        otherActivityBtn.setOnClickListener {
            val myIntent = Intent(mContext, OtherActivity::class.java)
            startActivity(myIntent)
        }

    }

    override fun setValues() {

    }


}