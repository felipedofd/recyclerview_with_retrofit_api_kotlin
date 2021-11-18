package com.example.recyclerview_with_retrofit_api_kotlin

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider
import com.example.recyclerview_with_retrofit_api_kotlin.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private lateinit var dogsViewModel: DogViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        dogsViewModel =ViewModelProvider(this)[DogViewModel::class.java]
        dogsViewModel.buscarDogs("med")
        dogsViewModel.dogs.observe(this){
            binding.recyclerView.adapter = ListAdapter(it,this)
        }

    }

}