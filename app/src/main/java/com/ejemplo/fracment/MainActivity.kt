package com.ejemplo.fracment

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.ejemplo.fracment.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding:ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_main)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


        binding.Butact2.setOnClickListener {
            val act2 = Intent(this, MainActivity2::class.java) //gcreamos el intent
            //val act2 = intent(this, MainActivity2::class.java)
            act2.putExtra( "saludo", "Hola a todos") //usamos putExtra para pasar valores a otro Activity
            startActivity(act2) //lansamos segundo activity
        }

    }
}