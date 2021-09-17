package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.google.android.gms.maps.MapView

class SplashActivity(val value: Boolean) : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)
        val button=findViewById<Button>(R.id.button)
        button.setOnClickListener {
            val intent = Intent(this ,MainActivity::class.java)
            startActivity(intent)
            val shareProfile=findViewById<Button>(R.id.shareProfile)
            shareProfile.setOnClickListener {
                if (value !=null){
                    this.ShareProfile()
                }

            }

        }
        val playSound =findViewById<Button>(R.id.playSound)
        playSound.setOnClickListener {
            val intent = Intent(this ,MainActivity2::class.java)
            startActivity(intent)
        }
        val mapView =findViewById<MapView>(R.id.mapView)
        mapView.setOnClickListener {
            val intent = Intent(this ,LocationActivity::class.java)
            startActivity(intent)
        }
        val shareVideo =findViewById<Button>(R.id.shareVideo)
        shareVideo.setOnClickListener {
            val intent = Intent(this ,VideoActivity::class.java)
            startActivity(intent)
        }
    }
    private fun ShareProfile(){
        val sendIntent :Intent=Intent().apply{
            action=Intent.ACTION_SEND
            putExtra(Intent.EXTRA_TEXT, "Hey Felicia")
            type ="text/plain"
        }

    }
}