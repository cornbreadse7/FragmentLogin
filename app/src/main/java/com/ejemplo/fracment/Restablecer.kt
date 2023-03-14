package com.ejemplo.fracment

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.ejemplo.fracment.databinding.ActivityRestablecerBinding

class Restablecer : AppCompatActivity() {

    private lateinit var binding: ActivityRestablecerBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_restablecer)

        binding = ActivityRestablecerBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.Butact.setOnClickListener {

            val act = Intent(this, MainActivity::class.java)
            startActivity(act)
            //val act3 = Intent(this, MainActivity3::class.java)
            //startActivity(act3)
        }



    }
}