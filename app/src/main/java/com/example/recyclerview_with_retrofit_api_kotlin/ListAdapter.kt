package com.example.recyclerview_with_retrofit_api_kotlin

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.example.DogApiResponse
import com.example.recyclerview_with_retrofit_api_kotlin.databinding.ItemListBinding
import com.squareup.picasso.Picasso

class ListAdapter(private val dogApiResponse : List<DogApiResponse>, private val context: Context) :
    RecyclerView.Adapter<ListAdapter.ViewHolder>() {

    class ViewHolder(val binding: ItemListBinding) : RecyclerView.ViewHolder(binding.root){
        fun bind(response: DogApiResponse){
            binding.nomeDog.text  = response.breeds.first().name
            binding.temperamentoDog.text = response.breeds.first().temperament
            Picasso.get().load(response.url).into(binding.imageDog)
            binding.bottomDescription.text = response.breeds.first().lifeSpan
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val binding = ItemListBinding.inflate(LayoutInflater.from(context), parent, false)
        return ViewHolder(binding)

    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val response = dogApiResponse[position]
        holder.bind(response)
    }

    override fun getItemCount(): Int {
        return dogApiResponse.size
    }
}