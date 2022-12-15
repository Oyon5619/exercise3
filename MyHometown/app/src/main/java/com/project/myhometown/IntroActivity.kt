package com.project.myhometown

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.project.myhometown.databinding.ActivityIntroBinding

class IntroActivity : AppCompatActivity() {
    private lateinit var aib: ActivityIntroBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        aib = ActivityIntroBinding.inflate(layoutInflater)
        setContentView(aib.root)

        aib.introBack.setOnClickListener {
            var intent = Intent(this@IntroActivity, MainActivity::class.java)
            startActivity(intent)
        }
    }
}