package com.mkrdeveloper.videoviewexample

import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.MediaController
import android.widget.VideoView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val videoView = findViewById<VideoView>(R.id.videoView)

        val  mediaController = MediaController(this)

        val pathOfVideo = Uri.parse("android.resource://$packageName/${R.raw.mkrdeveloper}")

        videoView.setMediaController(mediaController)
        videoView.setVideoURI(pathOfVideo)
        videoView.requestFocus()
        videoView.start()
    }
}