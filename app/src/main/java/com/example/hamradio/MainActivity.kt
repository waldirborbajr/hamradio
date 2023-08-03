package com.example.hamradio

import android.content.Intent
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper

class MainActivity : AppCompatActivity() {
  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_main)

    supportActionBar?.hide()
    window.statusBarColor = Color.parseColor("#51576d")

    Handler(Looper.getMainLooper()).postDelayed({
      val intent = Intent(this, Home::class.java)
      startActivity(intent)
      finish()
    }, 3000)

  }
}