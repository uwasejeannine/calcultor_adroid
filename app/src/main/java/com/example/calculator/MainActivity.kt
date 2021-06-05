package com.example.calculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import java.awt.font.TextAttribute

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var num=findViewById<EditText>(R.id.etnumber2)
        var num2=findViewById<EditText>(R.id.etnumber3)
        var answer=findViewById<TextView>(R.id.tvanswer)

        var add=findViewById<Button>(R.id.etbutton)
        var division=findViewById<Button>(R.id.etbutton2)
        var subtract=findViewById<Button>(R.id.etbutton3)
        var mult=findViewById<Button>(R.id.etbutton4)

        add.setOnClickListener {
            var num=num.text.toString().toInt()
            var num2=num2.text.toString().toInt()
            var numbers=num+num2
            answer.text="${numbers}"
        }
        subtract.setOnClickListener {
            var num=num.text.toString().toInt()
            var num2=num2.text.toString().toInt()
            var numbers=num-num2
            answer.text="${numbers}"
        }
        mult.setOnClickListener {
            var num=num.text.toString().toInt()
            var num2=num2.text.toString().toInt()
            var numbers=num*num2
            answer.text="${numbers}"
        }
        division.setOnClickListener {
            var num=num.text.toString().toInt()
            var num2=num2.text.toString().toInt()
            var numbers=num%num2
            answer.text="${numbers}"
        }
        }
        }

