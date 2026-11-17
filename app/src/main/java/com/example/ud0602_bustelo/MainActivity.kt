package com.example.ud0602_bustelo

import android.os.Bundle
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.DefaultItemAnimator
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.ud0602_bustelo.adapter.PersonaAdapter
import com.example.ud0602_bustelo.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private lateinit var layoutManager: LinearLayoutManager
    private lateinit var adapter: PersonaAdapter
    private var listaPersonas: List<Persona> = emptyList()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        setSupportActionBar(binding.toolbar)

        ViewCompat.setOnApplyWindowInsetsListener(binding.main) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        listaPersonas = PersonaProvider.cargarLista()
        layoutManager = LinearLayoutManager(this)
        binding.rvPersonas.layoutManager = layoutManager
        binding.rvPersonas.setHasFixedSize(true)
        binding.rvPersonas.itemAnimator = DefaultItemAnimator()

        adapter = PersonaAdapter { persona -> onItemSelected(persona) }
        binding.rvPersonas.adapter = adapter
        adapter.submitList(listaPersonas)
    }

    private fun onItemSelected(persona: Persona) {
        Toast.makeText(this, "Has pulsado sobre ${persona.nombre}", Toast.LENGTH_SHORT).show()
    }
}
