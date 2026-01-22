package ejercicio1
import org.slf4j.LoggerFactory


fun pedirCliente(): Cliente {
    println("--- CLIENTE ---")
    println("Nombre >> ")
    val nombre = readln()
    println("Domicilio >> ")
    val domicilio = readln()
    return Cliente(nombre, domicilio)
}

fun pedirCompra(cliente: Cliente): Compra {
    println("--- COMPRA ---")
    println("Dia >> ")
    val dia = readln().toInt()
    println("Monto >> ")
    val monto = readln().toDouble()
    return Compra(cliente, dia, monto)
}

fun main() {
    val logger = LoggerFactory.getLogger("main")

}