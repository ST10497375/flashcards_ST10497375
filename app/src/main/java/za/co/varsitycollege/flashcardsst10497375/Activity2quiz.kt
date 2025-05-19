package za.co.varsitycollege.flashcardsst10497375

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Activity2quiz : AppCompatActivity() {
    private val questions = arrayOf(
        "Mandela was the first democratically elected president of South Africa" to true,
        "World War 1 began in August 1914" to false,
        "Abraham Lincoln was the first president of America" to false,
        "DRC gained independance in 1960" to true,
        "John F Kennedy was assassinated in September 1964" to false
    )
    private var currentIndex = 0
    private var score = 0
    //helps to organize




    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_activity2quiz)

        val txeQuestionTextView = findViewById<TextView>(R.id.txeQuestionTextView)
        val btnTrueButton = findViewById<Button>(R.id.btnTrueButton)
        val btnFalseButton = findViewById<Button>(R.id.btnFalseButton)





        txeQuestionTextView.text = questions[currentIndex].first
//currentIndex is basically the current scores as you answer each question

        btnTrueButton.setOnClickListener {
            if(questions[currentIndex].second == true) {
                score++
                Toast.makeText(
                    this, "correct!",
                    Toast.LENGTH_SHORT
                ).show()
            } else {
                Toast.makeText(this, "incorrect!",
                    Toast.LENGTH_SHORT).show()




            }
            currentIndex++
            if(currentIndex < questions.size) {
                txeQuestionTextView.text = questions[currentIndex].first
            } else {
                val intent = Intent(this, scoreActivity::class.java)
                intent.putExtra("score", score)
                startActivity(intent)
                finish()
            }//pushes onto the third score activity
        }

        btnFalseButton.setOnClickListener {
            if(questions[currentIndex].second == false) {
                score++
                Toast.makeText(
                    this, "correct!",
                    Toast.LENGTH_SHORT
                ).show()
            } else {
                Toast.makeText(
                    this, "incorrect!",
                    Toast.LENGTH_SHORT
                ).show()
            }//toast displays whether the answer is correct or not

            currentIndex++
            if(currentIndex < questions.size) {
                txeQuestionTextView.text = questions[currentIndex].first
            } else {
                val intent = Intent(this, scoreActivity::class.java)
                intent.putExtra("score", score)
                startActivity(intent)
                finish()
            }
        }



    }




}