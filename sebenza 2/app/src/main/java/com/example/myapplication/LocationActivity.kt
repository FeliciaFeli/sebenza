package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import java.lang.Math.log

class LocationActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_location)

        Locus.startLocationUpdates(this) { result ->
            result.location?.let {
            log.d(tag "Felica",result.location.toString()) }
            result.error?.let {
            log.d(tag "felicia",result.error.toString()) }
        }



    }

}