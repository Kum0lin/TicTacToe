package com.example.tictactoe

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        val cancel : Button = findViewById(R.id.cancel)

        cancel.setOnClickListener{
            finish()
        }

        val start : Button = findViewById(R.id.start)
        start.setOnClickListener{
            val Activity3 = Intent(this, MainActivity3::class.java)
            val textBox : EditText = findViewById(R.id.textBox)
            val textBox2 : EditText = findViewById(R.id.textBox2)
            val xPlayer = textBox.text.toString()
            val oPlayer = textBox2.text.toString()
            if(!xPlayer.isNullOrEmpty() && !oPlayer.isNullOrEmpty()) {
                Activity3.putExtra("string1", xPlayer)
                Activity3.putExtra("string2", oPlayer)
                startActivity(Activity3)
                finish()
            }
            else{
                val toast = Toast.makeText(this, "Please, write your names", Toast.LENGTH_SHORT)
                toast.show()
            }
        }
    }
}