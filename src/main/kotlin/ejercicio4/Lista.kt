package ejercicio4

class Lista {
    val lista = mutableListOf<Tarea>()
    fun agregar(tarea: Tarea) {
        lista.add(tarea)
    }
    fun eliminar(tarea: Tarea) {
        lista.remove(tarea)
    }
    fun mostrar() {
        for (i in lista) {
            println(i)
        }
    }
}