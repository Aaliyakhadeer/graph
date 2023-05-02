package com.example.graph

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.example.graph.databinding.ActivityLineChartBinding

class LineChartActivity : AppCompatActivity() {
    private lateinit var binding: ActivityLineChartBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this,R.layout.activity_line_chart)
        binding.apply {
            lineChart.gradientFillColors =
                intArrayOf(
                    Color.parseColor("#81FFFFFF"),
                    Color.TRANSPARENT
                )
            lineChart.animation.duration = animationDuration
            lineChart.onDataPointTouchListener = { index, _, _ ->
                tvChartData.text =
                    lineSet.toList()[index]
                        .second
                        .toString()
            }
            lineChart.animate(lineSet)
        }

    }
    companion object {
        private val lineSet = listOf(
            "label1" to 5f,
            "label2" to 4.5f,
            "label3" to 4.7f,
            "label4" to 3.5f,
            "label5" to 3.6f,
            "label6" to 7.5f,
            "label7" to 7.5f,
            "label8" to 10f,
            "label9" to 5f,
            "label10" to 6.5f,
            "label11" to 3f,
            "label12" to 4f
        )
        private const val animationDuration = 1000L
    }
}


