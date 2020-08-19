package kr.co.tjoeun.lifecycle_200817

import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_other.*

class OtherActivity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_other)
        setUpEvents()
        setValues()

        Log.d("다른화면", "Oncreate 실행됨")

}
    override fun setUpEvents() {

    }

    override fun setValues() {

        backToMainBtn.setOnClickListener {
            finish()
        }

    }


}