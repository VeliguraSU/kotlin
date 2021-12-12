package com.example.kotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    private val tv: TextView? = null
    private val buttontv: Button? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val person = Person("Ivan", "Ivanov", 29)
        setContentView(R.layout.activity_main)
        val tv = findViewById<TextView>(R.id.tv)
        val tv2 = findViewById<TextView>(R.id.tv2)
        val buttontv = findViewById<Button>(R.id.button_tv)
        buttontv.setOnClickListener { view: View? ->
            tv.text = person.Name
            tv2.text = person.Name2

        }
    }
}