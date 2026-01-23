package ejercicio1
import org.slf4j.LoggerFactory

fun pedirDomicilio(): Domicilio {
    println("--- DOMICILIO ---")
    println("Calle >> ")
    val calle = readln()
    println("Número >> ")
    val numero = readln().toInt()
    return Domicilio(calle, numero)
}

fun pedirCliente(domicilio: Domicilio): Cliente {
    println("--- CLIENTE ---")
    println("Nombre >> ")
    val nombre = readln()
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
    val domicilio = pedirDomicilio()
    val cliente = pedirCliente(domicilio)
    val compra = pedirCompra(cliente)
    logger.info("Direccion >> ${domicilio.dirCompleta()}")
}