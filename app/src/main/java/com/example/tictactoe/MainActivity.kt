package com.example.tictactoe

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val author : Button = findViewById(R.id.author)
        val newGame : Button = findViewById(R.id.newGame)
        val exit : Button = findViewById(R.id.exit)
        author.setOnClickListener{
            val toast = Toast.makeText(this, "191RDB125 Dmitrijs Komolins", Toast.LENGTH_SHORT)
            toast.show()
        }

        exit.setOnClickListener {
            finish()
        }
        
        newGame.setOnClickListener{
                val Activity2 = Intent(this, MainActivity2::class.java)
                startActivity(Activity2)
        }

    }


}