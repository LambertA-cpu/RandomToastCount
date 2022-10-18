package com.example.android

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import android.widget.Toast
import java.lang.Math.random

class MainActivity : AppCompatActivity() {

    private var mCount = 0
    private var mshowCount:TextView? = null

    private var rnds = 1
    private var showRnds:TextView? = null



    override fun onCreate(savedInstanceState: Bundle?)  {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        mshowCount = findViewById<TextView>(R.id.show_count)
        showRnds = findViewById<TextView>(R.id.show_count)


    }

    fun showToast(view: View) {
        Toast.makeText(this, "HelloToast!", Toast.LENGTH_SHORT).show()
    }

    fun countUp(view: View) {
       mCount++
        if(mshowCount != null){
            mshowCount!!.text = mCount.toString()
        }
    }

    fun rollingDice(view: View) {
        rnds = (1..6).random()
        if(rnds != null){
            showRnds!!.text = rnds.toString()
        }
    }
}
