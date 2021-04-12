package com.example.tictactoe

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class Victory : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_victory)
        val playAgain : Button = findViewById(R.id.playAgain)
        val mainMenu: Button = findViewById(R.id.mainMenu)
        val player : TextView = findViewById(R.id.textView2)
        val winner:String = intent.getStringExtra("string3").toString()
        player.text = winner
        playAgain.setOnClickListener {
            finish()
            val Activity2 = Intent(this, MainActivity2::class.java)
            startActivity(Activity2)
        }
        mainMenu.setOnClickListener {
            finish()
        }
    }
}