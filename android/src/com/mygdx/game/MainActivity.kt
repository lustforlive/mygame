package com.mygdx.game


import android.content.Intent
import android.os.Bundle
import android.widget.Button
import com.badlogic.gdx.backends.android.AndroidApplication

class MainActivity : AndroidApplication() {
    private lateinit var list:Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        list=findViewById<Button>(R.id.but1)
        list.setOnClickListener{
            startActivity(Intent(this,SecondaryScreen::class.java))
        }
    }
}