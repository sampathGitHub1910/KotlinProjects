package com.example.kotlinproject02

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val engineStatus: TextView = findViewById(R.id.engine_status)
        val batteryStatus: TextView = findViewById(R.id.battery_status)
        val tirePressure: TextView = findViewById(R.id.tire_pressure)

        engineStatus.text = "Engine Status: Good"
        batteryStatus.text = "Battery Status: Charging"
        tirePressure.text = "Tire Pressure: Normal"
    }
}