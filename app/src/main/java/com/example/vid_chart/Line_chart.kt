package com.example.vid_chart

import android.graphics.Color
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.github.mikephil.charting.charts.LineChart
import com.github.mikephil.charting.data.Entry
import com.github.mikephil.charting.data.LineData
import com.github.mikephil.charting.data.LineDataSet
import com.github.mikephil.charting.utils.ColorTemplate

class Line_chart : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_line_chart)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val lineChart= findViewById<LineChart>(R.id.linechart)
        val entries = listOf(
            Entry(0f, 1f),
            Entry(1f, 3f),
            Entry(2f, 2f),
            Entry(3f, 5f),
            Entry(4f, 4f)
        )
        val dataSet = LineDataSet(entries, "Age")
        dataSet.color = android.graphics.Color.GREEN
        val lineData = LineData(dataSet)
        lineChart.data = lineData
        lineChart.animateXY(1000,1000)
        lineChart.invalidate()


    }
}