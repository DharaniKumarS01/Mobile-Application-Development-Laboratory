package com.example.moviefragmentapp

import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment

class MainActivity : AppCompatActivity() {

    private lateinit var btnBasic: Button
    private lateinit var btnAdditional: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnBasic = findViewById(R.id.btnBasic)
        btnAdditional = findViewById(R.id.btnAdditional)

        if (savedInstanceState == null) {
            replaceFragment(MovieBasicFragment())
        }

        btnBasic.setOnClickListener {
            replaceFragment(MovieBasicFragment())
        }

        btnAdditional.setOnClickListener {
            replaceFragment(MovieAdditionalFragment())
        }
    }

    private fun replaceFragment(fragment: Fragment) {
        supportFragmentManager.beginTransaction()
            .replace(R.id.fragmentContainer, fragment)
            .commit()
    }
}