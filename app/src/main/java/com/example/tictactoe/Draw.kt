package com.example.tictactoe

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class Draw : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.draw)

        val playAgain : Button = findViewById(R.id.again)
        val mainMenu: Button = findViewById(R.id.menu)
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