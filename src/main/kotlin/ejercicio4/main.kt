package ejercicio4
import org.slf4j.LoggerFactory

fun main() {
    val logger = LoggerFactory.getLogger("main")
    val estudiar = Tarea("Estudiar")
    val lista = Lista()
    lista.agregar(estudiar)
    logger.info(estudiar.toString())
    estudiar.cambiarEstado()
    logger.info(estudiar.toString())
    println(estudiar.horaRealizada) // Lo pongo con un print porque el Logger no funciona  aqui
}