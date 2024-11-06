package com.example.vid_chart

import android.graphics.Color
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.github.mikephil.charting.charts.PieChart
import com.github.mikephil.charting.data.Entry
import com.github.mikephil.charting.data.PieData
import com.github.mikephil.charting.data.PieDataSet
import com.github.mikephil.charting.data.PieEntry

class Pie_chart : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_pie_chart)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val pieChart = findViewById<PieChart>(R.id.piechart)
        val entries = listOf(
            PieEntry(10f,"young"),
            PieEntry(30f,"middle"),
            PieEntry(15f,"odd"),
            PieEntry(80f,"dead"),
        )
        val dataset = PieDataSet(entries,"Categories")
        dataset.colors = listOf(Color.RED, Color.GREEN, Color.BLUE, Color.YELLOW)
        val pieData = PieData(dataset)
        pieChart.data= pieData
        pieChart.animateY(10000)
        pieChart.invalidate()


    }
}