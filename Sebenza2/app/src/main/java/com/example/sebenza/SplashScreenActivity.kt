package com.example.sebenza

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class SplashScreenActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen)

        val button=findViewById<Button>(R.id.button)
        button.setOnClickListener{view ->
            val activityIntent = Intent(this ,MainActivity::class.java)
            startActivity(activityIntent)
        }






    }
}