package com.project.myhometown

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.project.myhometown.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var bd: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        bd = ActivityMainBinding.inflate(layoutInflater)
        setContentView(bd.root)

        bd.apply {
            imgFlipper.startFlipping()

            btn1.setOnClickListener {
                var intent1 = Intent(this@MainActivity, IntroActivity::class.java)
                startActivity(intent1)
            }

            btn2.setOnClickListener {
                var intent2 = Intent(this@MainActivity, PlaceActivity::class.java)
                startActivity(intent2)
            }

            btn3.setOnClickListener {
                var intent3 = Intent(this@MainActivity, FoodActivity::class.java)
                startActivity(intent3)
            }
        }
    }
}