package com.lesmeilleurscnous.parap

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class ParaActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_para)

        val customButton = findViewById<Button>(R.id.customButton)

        // Mettre à jour le texte du bouton en fonction de vos besoins
        val buttonText = "Suivre votre paraplégique"
        customButton.text = buttonText

    }
}