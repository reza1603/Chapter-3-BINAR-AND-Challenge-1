package and.binar.myfirstapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //this is only comments

        val btnClickMe = findViewById<Button>(R.id.mybutton)
        val tvMyTextView = findViewById<TextView>(R.id.textView)
        var timesClicked = 0
        btnClickMe.setOnClickListener {
            timesClicked = timesClicked + 1

            tvMyTextView.text = timesClicked.toString()
            Toast.makeText(this, "Hey, I'm a Reza btw!", Toast.LENGTH_LONG).show()
        }

    }
}