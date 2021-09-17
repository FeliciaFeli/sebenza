package com.example.myapplication

import android.app.Activity
import android.content.Intent
import android.graphics.Bitmap
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.MediaStore
import android.widget.Button
import android.widget.ImageView
import android.widget.VideoView

class VideoActivity : AppCompatActivity() {
    private val REQUEST_CODE_VIDEO=100
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_video)
        val button =findViewById<Button>(R.id.button)
       val videoView=findViewById<VideoView>(R.id.videoView)
        button.setOnClickListener {
            this.CaptureVideo()
        }


       private fun CaptureVideo() {
            val cameraIntent = Intent(MediaStore.ACTION_VIDEO_CAPTURE)
            startActivityForResult(cameraIntent,REQUEST_CODE_VIDEO)
        }

    }
    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        if (resultCode== RESULT_OK && requestCode==REQUEST_CODE_VIDEO&&data!=null){
            val videoView = null
            videoView.run {
                setVideoBitmap.Bitmap(data.extras?.get("data") as Bitmap)
            }


    }
}


}
