package com.example.vid_chart

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.github.mikephil.charting.charts.BarChart
import com.github.mikephil.charting.data.BarData
import com.github.mikephil.charting.data.BarDataSet
import com.github.mikephil.charting.data.BarEntry
import com.github.mikephil.charting.data.Entry

class Bar_chart : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_bar_chart)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val barChart = findViewById<BarChart>(R.id.barchart)

        val entries = listOf(
            BarEntry(0f,5f),
            BarEntry(1f,35f),
            BarEntry(2f,56f),
            BarEntry(3f,15f)

        )
        val dataSet = BarDataSet(entries, "Age")
        dataSet.color = android.graphics.Color.RED
        val barData = BarData(dataSet)
        barChart.data = barData
        barChart.invalidate()

    }
}