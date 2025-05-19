package za.co.varsitycollege.flashcardsst10497375

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.lifecycle.findViewTreeViewModelStoreOwner

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)


        val txeFlashQuizTextView = findViewById<TextView>(R.id.txeFlashQuizTextView)
        val btnStartButton = findViewById<Button>(R.id.btnStartButton)

        btnStartButton.setOnClickListener {
            val intent = Intent(this, Activity2quiz::class.java)
            startActivity(intent)
        }
//made sure button is alligned to second activity

    }
}