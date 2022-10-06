package com.example.fragmentlifecycles_11

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.fragmentlifecycles_11.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.buttonOpen.setOnClickListener {
            supportFragmentManager
                .beginTransaction()
                .replace(R.id.frameLayout, BlankFragment2.newInstance())
                .commit()
        }

        supportFragmentManager
            .beginTransaction()
            .replace(R.id.frameLayout, BlankFragment.newInstance())
            .commit()
    }
}