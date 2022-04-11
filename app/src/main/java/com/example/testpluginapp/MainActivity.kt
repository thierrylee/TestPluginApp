package com.example.testpluginapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        set_up_listeners()
    }

    private fun set_up_listeners() {
        findViewById<TextView>(R.id.helloWorldTextView).setOnClickListener {
            TestUtils().do_something()
        }
    }

}