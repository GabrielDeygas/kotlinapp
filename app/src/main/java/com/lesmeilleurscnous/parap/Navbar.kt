package com.lesmeilleurscnous.parap

import android.content.Context
import android.content.Intent
import android.util.AttributeSet
import android.widget.Button
import android.widget.LinearLayout

class Navbar @JvmOverloads constructor(
    context: Context, attrs: AttributeSet? = null, defStyleAttr: Int = 0
) : LinearLayout(context, attrs, defStyleAttr) {

    init {
        inflate(context, R.layout.navbar_layout, this)

        val buttonConcert = findViewById<Button>(R.id.button_concert)
        val buttonPara = findViewById<Button>(R.id.button_para)
        val buttonHome = findViewById<Button>(R.id.button_home)
        val buttonMap = findViewById<Button>(R.id.button_map)
        val buttonInfo = findViewById<Button>(R.id.button_info)

        // Gestion du clic du bouton "Concert"
        buttonConcert.setOnClickListener {
            val intent = Intent(context, ConcertActivity::class.java)
            context.startActivity(intent)
        }

        // Gestion du clic du bouton "Para"
        buttonPara.setOnClickListener {
            val intent = Intent(context, ParaActivity::class.java)
            context.startActivity(intent)
        }

        // Gestion du clic du bouton "Home"
        buttonHome.setOnClickListener {
            val intent = Intent(context, MainActivity::class.java)
            context.startActivity(intent)
        }

        // Gestion du clic du bouton "Map"
        buttonMap.setOnClickListener {
            val intent = Intent(context, MapActivity::class.java)
            context.startActivity(intent)
        }

        // Gestion du clic du bouton "Info"
        buttonInfo.setOnClickListener {
            val intent = Intent(context, InfoActivity::class.java)
            context.startActivity(intent)
        }
    }
}