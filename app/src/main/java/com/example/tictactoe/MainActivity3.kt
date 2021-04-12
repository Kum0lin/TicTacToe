package com.example.tictactoe

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity


fun turn (k: Int): Boolean {
    var count = k
    if (count%2==0){
        return true
    }
    else {
        return false
    }
}
fun xIsWinner(btn1: Button, btn2: Button, btn3: Button,btn4: Button,btn5: Button,btn6: Button,btn7: Button,btn8: Button,btn9: Button ): Boolean {
    if (btn1.text == "X" && btn2.text == "X" && btn3.text == "X") {return true}
    if (btn4.text == "X" && btn5.text == "X" && btn6.text == "X") {return true}
    if (btn7.text == "X" && btn8.text == "X" && btn9.text == "X") {return true}
    if (btn1.text == "X" && btn4.text == "X" && btn7.text == "X") {return true}
    if (btn2.text == "X" && btn5.text == "X" && btn8.text == "X") {return true}
    if (btn3.text == "X" && btn6.text == "X" && btn9.text == "X") {return true}
    if (btn1.text == "X" && btn5.text == "X" && btn9.text == "X") {return true}
    if (btn3.text == "X" && btn5.text == "X" && btn7.text == "X") {return true}
    else{return false}
}
fun oIsWinner(btn1: Button, btn2: Button, btn3: Button,btn4: Button,btn5: Button,btn6: Button,btn7: Button,btn8: Button,btn9: Button ): Boolean {
    if (btn1.text == "O" && btn2.text == "O" && btn3.text == "O") {return true}
    if (btn4.text == "O" && btn5.text == "O" && btn6.text == "O") {return true}
    if (btn7.text == "O" && btn8.text == "O" && btn9.text == "O") {return true}
    if (btn1.text == "O" && btn4.text == "O" && btn7.text == "O") {return true}
    if (btn2.text == "O" && btn5.text == "O" && btn8.text == "O") {return true}
    if (btn3.text == "O" && btn6.text == "O" && btn9.text == "O") {return true}
    if (btn1.text == "O" && btn5.text == "O" && btn9.text == "O") {return true}
    if (btn3.text == "O" && btn5.text == "O" && btn7.text == "O") {return true}
    else{return false}
}

class MainActivity3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        fun victory(winner: String){
            val Victory = Intent(this, Victory::class.java)
            val player = winner
            Victory.putExtra("string3", player)
            startActivity(Victory)
        }
        fun draw(){
            val draw = Intent(this, Draw::class.java)
            startActivity(draw)
        }
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)
        val xPlayer: String = intent.getStringExtra("string1").toString()
        val oPlayer:String = intent.getStringExtra("string2").toString()
        var turn : TextView = findViewById(R.id.turn)
        var btn1 : Button = findViewById(R.id.B1)
        var btn2 : Button = findViewById(R.id.B2)
        var btn3 : Button = findViewById(R.id.B3)
        var btn4 : Button = findViewById(R.id.B4)
        var btn5 : Button = findViewById(R.id.B5)
        var btn6 : Button = findViewById(R.id.B6)
        var btn7 : Button = findViewById(R.id.B7)
        var btn8 : Button = findViewById(R.id.B8)
        var btn9 : Button = findViewById(R.id.B9)
        var count : Int = 0
        turn.text = "X"
        btn1.setOnClickListener{
            if(btn1.text!=""){
                return@setOnClickListener
            }
            if(turn(count)==true) {
                btn1.text = "X"
                count++
                turn.text = "O"
            }
            else{
                btn1.text = "O"
                count++
                turn.text = "X"
            }
            if(count==9 && !xIsWinner(btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9) && !oIsWinner(btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9) ){
                draw()
                finish()
            }
            else{
                if(xIsWinner(btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9)){

                    victory(xPlayer)
                    finish()
                }
                if(oIsWinner(btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9)){

                    victory(oPlayer)
                    finish()
                }
            }
        }
        btn2.setOnClickListener{
            if(btn2.text!=""){
                return@setOnClickListener
            }
            if(turn(count)==true) {
                btn2.text = "X"
                count++
                turn.text = "O"
            }
            else{
                btn2.text = "O"
                count++
                turn.text = "X"
            }
            if(count==9 && !xIsWinner(btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9) && !oIsWinner(btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9) ){
               draw()
                finish()
            }
            else{
                if(xIsWinner(btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9)){

                    victory(xPlayer)
                    finish()
                }
                if(oIsWinner(btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9)){

                    victory(oPlayer)
                    finish()
                }
            }
        }
        btn3.setOnClickListener{
            if(btn3.text!=""){
                return@setOnClickListener
            }
            if(turn(count)==true) {
                btn3.text = "X"
                count++
                turn.text = "O"
            }
            else{
                btn3.text = "O"
                count++
                turn.text = "X"
            }
            if(count==9 && !xIsWinner(btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9) && !oIsWinner(btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9) ){
                draw()
                finish()
            }
            else{
                if(xIsWinner(btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9)){

                    victory(xPlayer)
                    finish()
                }
                if(oIsWinner(btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9)){

                    victory(oPlayer)
                    finish()
                }
            }
        }
        btn4.setOnClickListener{
            if(btn4.text!=""){
                return@setOnClickListener
            }
            if(turn(count)==true) {
                btn4.text = "X"
                count++
                turn.text = "O"
            }
            else{
                btn4.text = "O"
                count++
                turn.text = "X"
            }
            if(count==9 && !xIsWinner(btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9) && !oIsWinner(btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9) ){
               draw()
                finish()
            }
            else{
                if(xIsWinner(btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9)){

                    victory(xPlayer)
                    finish()
                }
                if(oIsWinner(btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9)){

                    victory(oPlayer)
                    finish()
                }
            }
        }
        btn5.setOnClickListener{
            if(btn5.text!=""){
                return@setOnClickListener
            }
            if(turn(count)==true) {
                btn5.text = "X"
                count++
                turn.text = "O"
            }
            else{
                btn5.text = "O"
                count++
                turn.text = "X"
            }
            if(count==9 && !xIsWinner(btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9) && !oIsWinner(btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9) ){
                draw()
           }
            else{
                if(xIsWinner(btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9)){

                    victory(xPlayer)
                    finish()
                }
                if(oIsWinner(btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9)){

                    victory(oPlayer)
                    finish()
                }
            }
        }
        btn6.setOnClickListener{
            if(btn6.text!=""){
                return@setOnClickListener
            }
            if(turn(count)==true) {
                btn6.text = "X"
                count++
                turn.text = "O"
            }
            else{
                btn6.text = "O"
                count++
                turn.text = "X"
            }
            if(count==9 && !xIsWinner(btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9) && !oIsWinner(btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9) ){
                draw()
                finish()
            }
            else{
                if(xIsWinner(btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9)){

                    victory(xPlayer)
                    finish()
                }
                if(oIsWinner(btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9)){

                    victory(oPlayer)
                    finish()
                }
            }
        }
        btn7.setOnClickListener{
            if(btn7.text!=""){
                return@setOnClickListener
            }
            if(turn(count)==true) {
                btn7.text = "X"
                count++
                turn.text = "O"
            }
            else{
                btn7.text = "O"
                count++
                turn.text = "X"
            }
            if(count==9 && !xIsWinner(btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9) && !oIsWinner(btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9) ){
                draw()
                finish()
            }
            else{
                if(xIsWinner(btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9)){

                    victory(xPlayer)
                    finish()
                }
                if(oIsWinner(btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9)){

                    victory(oPlayer)
                    finish()
                }
            }
        }
        btn8.setOnClickListener{
            if(btn8.text!=""){
                return@setOnClickListener
            }
            if(turn(count)==true) {
                btn8.text = "X"
                count++
                turn.text = "O"
            }
            else{
                btn8.text = "O"
                count++
                turn.text = "X"
            }
            if(count==9 && !xIsWinner(btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9) && !oIsWinner(btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9) ){
                draw()
                finish()
            }
            else{
                if(xIsWinner(btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9)){

                    victory(xPlayer)
                    finish()
                }
                if(oIsWinner(btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9)){

                    victory(oPlayer)
                    finish()
                }
            }
        }
        btn9.setOnClickListener{
            if(btn9.text!=""){
                return@setOnClickListener
            }
            if(turn(count)==true) {
                btn9.text = "X"
                count++
                turn.text = "O"
            }
            else{
                btn9.text = "O"
                count++
                turn.text = "X"
            }
            if(count==9 && !xIsWinner(btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9) && !oIsWinner(btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9) ){
                draw()
                finish()
            }
            else{
                if(xIsWinner(btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9)){

                    victory(xPlayer)
                    finish()
                }
                if(oIsWinner(btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9)){

                    victory(oPlayer)
                    finish()
                }
            }
        }


    }
}