package ejercicio4
import java.time.LocalDateTime
import java.time.format.DateTimeFormatter

class Tarea(
    val descripcion: String,
) {
    val horaRealizada = mutableMapOf<String, String>()
    var id: Int = 0
    var estado: String = "Pendiente"
    set(value) {
        if (value == "Realizado") {
            val fechaHoraActual: LocalDateTime = LocalDateTime.now()
            val formatter: DateTimeFormatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss")
            val fechaFormateada: String = fechaHoraActual.format(formatter)
            horaRealizada[descripcion] = fechaFormateada
            field = value
        }
    }

    fun cambiarEstado() {
        estado = "Realizado"
    }
    override fun toString(): String {
        return "$descripcion >> $estado"
    }
    init {
        contador++
        id = contador
    }

    companion object {
        private var contador = 0
    }
}