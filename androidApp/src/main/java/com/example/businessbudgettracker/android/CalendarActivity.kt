package com.example.businessbudgettracker.android

import android.os.Bundle
import android.widget.CalendarView
import androidx.appcompat.app.AppCompatActivity
import android.widget.Toast

class CalendarActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_calendar)

        val calendarView = findViewById<CalendarView>(R.id.calendarView)
        calendarView.setOnDateChangeListener { view, year, month, dayOfMonth ->
            // Display a toast or start an activity
            val date = "$dayOfMonth/${month + 1}/$year"
            Toast.makeText(this, "Selected date: $date", Toast.LENGTH_SHORT).show()

            // For more functionality like zooming out to month and year,
            // you will need to implement a custom calendar or use a third-party library.
        }
    }
}
