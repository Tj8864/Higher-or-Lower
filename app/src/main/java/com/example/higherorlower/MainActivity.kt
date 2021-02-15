package com.example.higherorlower

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import java.util.*
import kotlin.system.exitProcess

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val higher = findViewById<Button>(R.id.higher_button)
        val lower = findViewById<Button>(R.id.lower_button)
        val display = findViewById<ImageView>(R.id.number_display)
        val confirm = findViewById<Button>(R.id.confirm_button)
        val highBackGround = findViewById<ImageView>(R.id.higherbg)
        val lowerBackground = findViewById<ImageView>(R.id.lowerbg)
        val newGameButton = findViewById<Button>(R.id.restartButton)
        display.setImageResource(R.drawable.higherorlower)
        lower.setText("Lower")
        higher.setText("Higher")
        newGameButton.setText("Restart")
        confirm.setText("Confirm")
        var currentRandom = 0
        var previousRandom = 0
        val titleText = findViewById<TextView>(R.id.title_text)
        var choice = false
        var flag = true
        var flag2 = false
        var score = 0
        lowerBackground.setImageResource(R.drawable.white)
        highBackGround.setImageResource(R.drawable.white)
        currentRandom = Random().nextInt(20)
        newGameButton.setOnClickListener {
            display.setImageResource(R.drawable.higherorlower)
            currentRandom = 0
            previousRandom = 0
            score = 0
            choice = false
            flag2 = false
            flag = true
        }
        higher.setOnClickListener{
            choice = true
            highBackGround.setImageResource(R.drawable.yellow)
            lowerBackground.setImageResource(R.drawable.white)
            flag = true
        }
        lower.setOnClickListener {
            choice = false
            highBackGround.setImageResource(R.drawable.white)
            lowerBackground.setImageResource(R.drawable.yellow)
            flag = true
        }
        confirm.setOnClickListener {
            lowerBackground.setImageResource(R.drawable.white)
            highBackGround.setImageResource(R.drawable.white)
            if(!flag2){
                currentRandom = Random().nextInt(20)
                when (currentRandom) {
                    1 -> display.setImageResource(R.drawable.one)
                    2 -> display.setImageResource(R.drawable.tqo)
                    3 -> display.setImageResource(R.drawable.three)
                    4 -> display.setImageResource(R.drawable.four)
                    5 -> display.setImageResource(R.drawable.five)
                    6 -> display.setImageResource(R.drawable.six)
                    7 -> display.setImageResource(R.drawable.seven)
                    8 -> display.setImageResource(R.drawable.eight)
                    9 -> display.setImageResource(R.drawable.nine)
                    10 -> display.setImageResource(R.drawable.ten)
                    11 -> display.setImageResource(R.drawable.eleven)
                    12 -> display.setImageResource(R.drawable.twelve)
                    13 -> display.setImageResource(R.drawable.thirteen)
                    14 -> display.setImageResource(R.drawable.fourteen)
                    15 -> display.setImageResource(R.drawable.fifteen)
                    16 -> display.setImageResource(R.drawable.sixteen)
                    17 -> display.setImageResource(R.drawable.seventeen)
                    18 -> display.setImageResource(R.drawable.eighteen)
                    19 -> display.setImageResource(R.drawable.nineteen)
                    20 -> display.setImageResource(R.drawable.twenty)
                }
                flag2 = true
            }
            else if(flag){
                previousRandom = currentRandom
                currentRandom = Random().nextInt(20)
                when (currentRandom) {
                    1 -> display.setImageResource(R.drawable.one)
                    2 -> display.setImageResource(R.drawable.tqo)
                    3 -> display.setImageResource(R.drawable.three)
                    4 -> display.setImageResource(R.drawable.four)
                    5 -> display.setImageResource(R.drawable.five)
                    6 -> display.setImageResource(R.drawable.six)
                    7 -> display.setImageResource(R.drawable.seven)
                    8 -> display.setImageResource(R.drawable.eight)
                    9 -> display.setImageResource(R.drawable.nine)
                    10 -> display.setImageResource(R.drawable.ten)
                    11 -> display.setImageResource(R.drawable.eleven)
                    12 -> display.setImageResource(R.drawable.twelve)
                    13 -> display.setImageResource(R.drawable.thirteen)
                    14 -> display.setImageResource(R.drawable.fourteen)
                    15 -> display.setImageResource(R.drawable.fifteen)
                    16 -> display.setImageResource(R.drawable.sixteen)
                    17 -> display.setImageResource(R.drawable.seventeen)
                    18 -> display.setImageResource(R.drawable.eighteen)
                    19 -> display.setImageResource(R.drawable.nineteen)
                    20 -> display.setImageResource(R.drawable.twenty)
                }
                if (currentRandom > previousRandom == choice) {
                    lowerBackground.setImageResource(R.drawable.white)
                    highBackGround.setImageResource(R.drawable.white)
                    score += 1
                } else {
                    display.setImageResource(R.drawable.gameover)
                }
                flag = false
            }
        }
        titleText.setOnClickListener{
            Toast.makeText(this@MainActivity, "Score: $score", Toast.LENGTH_LONG).show()
        }
    }
}