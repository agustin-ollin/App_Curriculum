package com.example.introduccion

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import java.util.*

class MainActivity : AppCompatActivity() {
    // Referencia al botón
    lateinit var boton: Button

    /**
     * Método OnCreate
     */
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        eventoBoton()
    }

    /**
     * Método para asignar evento al botón
     */
    fun eventoBoton(){
        boton = findViewById(R.id.boton)
        boton.setOnClickListener(View.OnClickListener {
            //Toast.makeText(this, "El botón funciona", Toast.LENGTH_LONG).show()
            lanzarActividad()
        })
    }

    /**
     * Método para lanzar activity
     */
    fun lanzarActividad(){
        val intent = Intent(this, CVOllin::class.java)
        startActivity(intent)
    }
}