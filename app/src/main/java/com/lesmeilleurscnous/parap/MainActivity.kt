package com.lesmeilleurscnous.parap

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        // Trouver la référence du bouton inclus
        val customButton = findViewById<Button>(R.id.customButton)

        // Mettre à jour le texte du bouton en fonction de vos besoins
        val buttonText = "Programme"
        customButton.text = buttonText

        // Ajouter un gestionnaire de clic pour le bouton
        customButton.setOnClickListener {
            // L'action à effectuer lorsque le bouton est cliqué
            val intent = Intent(this, ProgrammeActivity::class.java)
            startActivity(intent)
        }
    }
}