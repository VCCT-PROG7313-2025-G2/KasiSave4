package com.example.kasisave4

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Feature1Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_feature1)

        val mainLayout = findViewById<View>(R.id.main)
        val skipLabel= findViewById<TextView>(R.id.skip_label)

        ViewCompat.setOnApplyWindowInsetsListener(mainLayout) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
skipLabel.setOnClickListener {startActivity(Intent(this, SignUpActivity::class.java))}

        // Navigate to Feature2Activity when the screen is tapped
        mainLayout.setOnClickListener {
            val intent = Intent(this, Feature2Activity::class.java)
            startActivity(intent)
        }//
    }
}