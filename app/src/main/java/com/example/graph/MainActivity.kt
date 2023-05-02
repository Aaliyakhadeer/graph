package com.example.graph

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.graph.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private var _binding: ActivityMainBinding? = null
    private val binding get() = _binding!!// add data binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        _binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
           binding.apply{
               btnLineChart.setOnClickListener{
                   startActivity(Intent(this@MainActivity, LineChartActivity::class.java))
               }
        }

    }

     override fun onDestroy(){
         super.onDestroy()
         _binding = null
     }
}

