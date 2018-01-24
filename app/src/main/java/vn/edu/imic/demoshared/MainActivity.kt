package vn.edu.imic.demoshared

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.EditText
import butterknife.BindView

class MainActivity : AppCompatActivity() {
    @BindView(R.id.ed_name)
    lateinit var edName: EditText
    @BindView(R.id.ed_city)
    lateinit var edCity: EditText
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}
