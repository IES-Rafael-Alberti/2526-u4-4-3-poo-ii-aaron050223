package ejercicio3

class ConjuntoLibros {
    val conjuntoLibros = ArrayList<Libro>(2)
    fun addLibro(libro: Libro) {
        conjuntoLibros.add(libro)
    }
    fun eliminarLibro(titulo: String, autor: String) {
        val elementosEliminar = conjuntoLibros.find { it.titulo == titulo && it.autor == autor }
        if (elementosEliminar != null) {
            conjuntoLibros.remove(elementosEliminar)
        }
    }
}