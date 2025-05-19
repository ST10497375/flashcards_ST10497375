package za.co.varsitycollege.flashcardsst10497375

import android.os.Bundle
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class scoreActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_score)

        val score = intent.getIntExtra("score", 0)
        val txeScoreTextView = findViewById<TextView>(R.id.txeScoreTextView)
        txeScoreTextView.text = "your score: $score / 5"
    }
}