package com.example.ud0602_bustelo

object PersonaProvider {
    fun cargarLista(): MutableList<Persona> {
        return mutableListOf(
            Persona(
                id = 1,
                nombre = "Ana",
                descripcion = "Amante de la naturaleza",
                foto = "chica01.jpg",
            ),
            Persona(
                id = 2,
                nombre = "Carlos",
                descripcion = "Le gusta programar y enseñar",
                foto = "chico01.jpg",
            ),
            Persona(
                id = 3,
                nombre = "María",
                descripcion = "Aficionada a la música",
                foto = "chica02.jpg",
            ),
            Persona(
                id = 4,
                nombre = "Pablo",
                descripcion = "Fotógrafo profesional",
                foto = "chico02.jpg",
            ),
            Persona(
                id = 5,
                nombre = "Lucía",
                descripcion = "Fanática de los libros de misterio",
                foto = "chica03.jpg",
            ),
            Persona(
                id = 6,
                nombre = "Javier",
                descripcion = "Deportista y corredor de maratones",
                foto = "chico03.jpg",
            ),
            Persona(
                id = 7,
                nombre = "Sofía",
                descripcion = "Cocina platos internacionales",
                foto = "chica04.jpg",
            ),
            Persona(
                id = 8,
                nombre = "Miguel",
                descripcion = "Apasionado por los viajes",
                foto = "chico04.jpg",
            ),
            Persona(
                id = 9,
                nombre = "Laura",
                descripcion = "Diseñadora gráfica",
                foto = "chica05.jpg",
            ),
            Persona(
                id = 10,
                nombre = "Andrés",
                descripcion = "Amante del cine clásico",
                foto = "chico05.jpg",
            ),
            Persona(
                id = 11,
                nombre = "Elena",
                descripcion = "Bailarina de ballet",
                foto = "chica06.jpg",
            ),
            Persona(
                id = 12,
                nombre = "Raúl",
                descripcion = "Toca la guitarra en una banda",
                foto = "chico06.jpg",
            ),
        )
    }
}
