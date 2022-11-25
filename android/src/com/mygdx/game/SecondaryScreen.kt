package com.mygdx.game


import android.content.Intent
import android.os.Bundle
import android.widget.ImageButton
import com.badlogic.gdx.backends.android.AndroidApplication

class SecondaryScreen : AndroidApplication() {
    private lateinit var image_button:ImageButton

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.secondscreen);
        image_button=findViewById<ImageButton>(R.id.setting)
        image_button.setOnClickListener {
            startActivity(Intent(this, Setting1::class.java))
        }
    }
}




//
//        fun onCreate(savedInstanceState: Bundle?) {
//            super.onCreate(savedInstanceState)
//            setContentView(R.layout.secondscreen)
//            list1 = findViewById<Button>(R.id.setting)
//            list1.setOnClickListener {
//                startActivity(Intent(this, SecondaryScreen::class.java))
//            }
//        }
//    }

//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_main)
//        list=findViewById<Button>(R.id.but1)
//        list.setOnClickListener{
//            startActivity(Intent(this,SecondaryScreen::class.java))
//        }
//    }
//}
