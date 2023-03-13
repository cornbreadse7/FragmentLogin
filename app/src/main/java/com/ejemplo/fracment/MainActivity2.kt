package com.ejemplo.fracment

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.commit
import androidx.fragment.app.replace
import com.ejemplo.fracment.databinding.ActivityMain2Binding

class MainActivity2 : AppCompatActivity() {
    private lateinit var binding: ActivityMain2Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_main2)


        binding = ActivityMain2Binding.inflate(layoutInflater)
        setContentView(binding.root)

        val datos = intent.extras

        binding.buttonInfo.setOnClickListener {
            if (datos != null) {
                binding.textContenido.setText(datos.getString("saludo"))
            }
        }


        supportFragmentManager.commit {
            replace<BlankFragment1>(R.id.contenedor)
            setReorderingAllowed(true)
            addToBackStack("replacement")
        }

        //Boton que reemplaza lo que tenga el frame(contenedor) por el fragment 1
        binding.buttonFrag1.setOnClickListener {
            supportFragmentManager.commit {
                replace<BlankFragment1>(R.id.contenedor)
                setReorderingAllowed(true)
                addToBackStack("replacement")
            }
        }

        binding.buttonFrag2.setOnClickListener {
            supportFragmentManager.commit {
                replace<BlankFragment2>(R.id.contenedor)
                setReorderingAllowed(true)
                addToBackStack("replacement")
            }
        }

        binding.buttonCerrar.setOnClickListener {
           finish()
        }

    }
}