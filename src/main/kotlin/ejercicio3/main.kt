package ejercicio3
import org.slf4j.LoggerFactory

fun main() {
    val logger = LoggerFactory.getLogger("main")
    val libro1 = Libro("Los Juegos del Hambre","Suzanne Collins", 250,9)
    val libro2 = Libro("Los Juegos del Hambre: En Llamas","Suzanne Collins", 230,10)
    val conjunto = ConjuntoLibros()
    conjunto.addLibro(libro1)
    conjunto.addLibro(libro2)
    logger.info("Conjunto >> ${conjunto.conjuntoLibros}")
    conjunto.eliminarLibro("Los Juegos del Hambre","Suzanne Collins")
    conjunto.eliminarLibro("Los Juegos del Hambre: En Llamas","Suzanne Collins")
    logger.info("Conjunto >> ${conjunto.conjuntoLibros}")
    conjunto.addLibro(libro1)
    logger.info("Conjunto >> ${conjunto.conjuntoLibros}")
}