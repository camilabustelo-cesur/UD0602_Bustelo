package com.example.ud0602_bustelo.adapter

import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.bumptech.glide.Glide
import com.bumptech.glide.load.engine.DiskCacheStrategy
import com.example.ud0602_bustelo.Persona
import com.example.ud0602_bustelo.R
import com.example.ud0602_bustelo.databinding.ItemPersonaBinding

class PersonaViewHolder(private val binding: ItemPersonaBinding) : ViewHolder(binding.root) {

    fun render(persona: Persona, onClickListener: (Persona) -> Unit) {
        binding.tvPersonaNombre.text = persona.nombre
        binding.tvDescripcion.text = persona.descripcion
        Glide.with(binding.ivPersona.context)
            .load("file:///android_asset/fotos/${persona.foto}")
            .centerCrop()
            .placeholder(R.drawable.ic_persona_placeholder)
            .error(R.drawable.ic_persona_error)
            .diskCacheStrategy(DiskCacheStrategy.ALL)
            .into(binding.ivPersona)
        binding.root.setOnClickListener {
            onClickListener(persona)
        }
    }
}
