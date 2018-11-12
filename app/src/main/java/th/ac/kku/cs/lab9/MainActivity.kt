package th.ac.kku.cs.lab9


import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    companion object {
        val KEY_DATA_STUDENT = "keyDataStudent"
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button_send.setOnClickListener {
            val intent = Intent(this, SecondActivity::class.java)

            val dataStudent = Student(
                    edit_text_id_std.text.toString(),
                    edit_text_first_name.text.toString(),
                    edit_text_last_name.text.toString()
            )

            intent.putExtra(KEY_DATA_STUDENT, dataStudent)
            startActivity(intent)
        }
    }
}
