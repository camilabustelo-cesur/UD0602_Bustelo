package com.example.ud0602_bustelo.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import com.example.ud0602_bustelo.Persona
import com.example.ud0602_bustelo.databinding.ItemPersonaBinding

class PersonaAdapter(
    private val onClickListener: (Persona) -> Unit,
) : ListAdapter<Persona, PersonaViewHolder>(DIFF_CALLBACK) {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PersonaViewHolder {
        val binding = ItemPersonaBinding.inflate(
            LayoutInflater.from(parent.context), parent, false
        )
        return PersonaViewHolder(binding)
    }

    override fun onBindViewHolder(holder: PersonaViewHolder, position: Int) {
        holder.render(getItem(position), onClickListener)
    }

    companion object {
        private val DIFF_CALLBACK = object : DiffUtil.ItemCallback<Persona>() {
            override fun areItemsTheSame(oldItem: Persona, newItem: Persona): Boolean =
                oldItem.id == newItem.id

            override fun areContentsTheSame(oldItem: Persona, newItem: Persona): Boolean =
                oldItem == newItem
        }
    }
}
