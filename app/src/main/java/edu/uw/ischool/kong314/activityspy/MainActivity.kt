package edu.uw.ischool.kong314.activityspy

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    private val tag = "MainActivity"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Log.i(tag, "onCreate event fired, Parameter: $savedInstanceState")
    }

    override fun onDestroy() {
        super.onDestroy()

        Log.i(tag, "onDestroy event fired")
        Log.e(tag, "\"I'm the king of the world.\" - Jack, Titanic (1997)")
    }

    override fun onPause() {
        super.onPause()

        Log.i(tag, "onPause event fired")
    }

    override fun onResume() {
        super.onResume()

        Log.i(tag, "onResume event fired")
    }

    override fun onStop() {
        super.onStop()

        Log.i(tag, "onStop event fired")
    }

    override fun onStart() {
        super.onStart()

        Log.i(tag, "onStart event fired")
    }
}