package com.example.cyclelifeapp

import android.os.Bundle
import android.util.Log
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class SecondActivity : AppCompatActivity() {

    companion object { private const val TAG = "SecondActivity" }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.i(TAG, "onCreate chamado")
        setContentView(R.layout.activity_second)

        val buttonBack = findViewById<Button>(R.id.buttonBack)
        buttonBack.setOnClickListener { finish() }
    }

    // activity visivel para o usuario mas nao interativa
    override fun onStart() {
        super.onStart()
        Log.i(TAG, "onStart chamado")
    }

    // primeiro plano e pode interagir
    override fun onResume() {
        super.onResume()
        Log.i(TAG, "onResume chamado")
    }

    // "segundo plano"
    override fun onPause() {
        super.onPause()
        Log.i(TAG, "onPause chamado")
    }

    // nao esta mais visivel
    override fun onStop() {
        super.onStop()
        Log.i(TAG, "onStop chamado")
    }

    // esta parada e vai reiniciar
    override fun onRestart() {
        super.onRestart()
        Log.i(TAG, "onRestart chamado")
    }

    // quando vai destruir a activity
    override fun onDestroy() {
        super.onDestroy()
        Log.i(TAG, "onDestroy chamado")
    }
}
