package com.example.midtermproject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main) // Assuming your XML layout file is named "activity_main.xml"

        val playButton = findViewById<Button>(R.id.playButton)
        val viewScoresButton = findViewById<Button>(R.id.viewScore)

        playButton.setOnClickListener {
            // Handle the "PlayButton" click event, start the game screen
            val newFragment = GameFragment() // Create an instance of the HighScoreFragment
            supportFragmentManager.beginTransaction()
                .replace(R.id.fragmentContainer, newFragment) // R.id.fragmentContainer should be the ID of the container where the fragment should be placed
                .commit()
        }

        viewScoresButton.setOnClickListener {
            val newFragment = HighScoreFragment() // Create an instance of the HighScoreFragment
            supportFragmentManager.beginTransaction()
                .replace(R.id.fragmentContainer, newFragment) // R.id.fragmentContainer should be the ID of the container where the fragment should be placed
                .commit()
        }
    }
}