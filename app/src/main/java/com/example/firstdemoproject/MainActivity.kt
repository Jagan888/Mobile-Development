package com.example.firstdemoproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    var RedColor="Red"
    var BlueColor="Blue"
    var GreenColor="Green"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val clickColorDisplayView=findViewById<TextView>(R.id.clickCountView)
        val clickRedButton=findViewById<TextView>(R.id.clickRed)
        val clickGreenButton=findViewById<TextView>(R.id.clickGreen)
        val clickBlueButton=findViewById<TextView>(R.id.clickBlue)

        clickRedButton.setOnClickListener {
            clickColorDisplayView.text=" $RedColor color"
        }


        clickGreenButton.setOnClickListener {
            clickColorDisplayView.text=" $GreenColor color"
        }

        clickBlueButton.setOnClickListener {
            clickColorDisplayView.text=" $BlueColor color"
        }

    }
    }
