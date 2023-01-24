package com.example.tsaapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageButton

// gradle is the build tool for android. It creates an apk package for your android device

class MainActivity : AppCompatActivity() {
    private lateinit var tapHereButton: Button // lateinit - we'll initialize later (ASAP)
    private lateinit var leftArrow: ImageButton
    private lateinit var rightArrow: ImageButton

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState) // behind the scenes setup
        setContentView(R.layout.activity_main) // xml layout setup
        // My code begins here

        tapHereButton = findViewById(R.id.tap_here_button) // initialized in OnCreate
        leftArrow = findViewById(R.id.left_arrow)
        rightArrow = findViewById(R.id.right_arrow)

        tapHereButton.setOnClickListener {
            showRandomArrow()
        }

        leftArrow.setOnClickListener {
            reset()
        }

        rightArrow.setOnClickListener {
            reset()
        }
    }

    private fun showRandomArrow() {
        tapHereButton.visibility = View.INVISIBLE
        val direction  =listOf("left", "right").random()
        if (direction == "left") {
            leftArrow.visibility = View.VISIBLE
        } else {
            rightArrow.visibility = View.VISIBLE
        }
    }
    private fun reset() {
        leftArrow.visibility = View.INVISIBLE
        rightArrow.visibility = View.INVISIBLE
        tapHereButton.visibility = View.VISIBLE
    }
}