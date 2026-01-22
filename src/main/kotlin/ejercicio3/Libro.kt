package ejercicio3

class Libro(
    val titulo: String,
    val autor: String,
    val numPaginas: Int,
    calificacion: Int
) {
    var calificacion: Int = 0
        set(value) {
            field = if (value in 0..10) value else when {
                value < 10 -> 10
                else -> 0
            }
        }
    init {
        this.calificacion = calificacion
    }
    override fun toString(): String {
        return "titulo: $titulo, autor: $autor, numPaginas: $numPaginas, calificación: $calificacion"
    }
}