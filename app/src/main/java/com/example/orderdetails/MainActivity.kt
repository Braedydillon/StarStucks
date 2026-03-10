package com.example.orderdetails

import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.orderdetails.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() , View.OnClickListener{
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

binding.Coffee1.setOnClickListener (this)



    }



    override fun onClick(v:View?){
        when(v?.id){
            R.id.Coffee1 -> Toast.makeText(this,"srgfghh", Toast.LENGTH_SHORT).show()
        }
    }
}