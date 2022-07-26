package com.example.profnotes.ui.splash

import android.annotation.SuppressLint
import android.app.Activity
import android.content.Intent
import android.os.Bundle
import com.example.profnotes.MainActivity

@SuppressLint("CustomSplashScreen")
class SplashActivity:Activity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val intent=Intent(this,MainActivity::class.java)
        startActivity(intent)
        finish()
    }
}