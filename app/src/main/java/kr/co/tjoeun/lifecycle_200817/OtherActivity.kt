package kr.co.tjoeun.lifecycle_200817

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class OtherActivity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_other)
        setUpEvents()
        setValues()

}
    override fun setUpEvents() {

    }

    override fun setValues() {

    }


}