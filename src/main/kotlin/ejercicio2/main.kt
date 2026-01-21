package ejercicio2
import org.slf4j.LoggerFactory

fun main() {
    val logger = LoggerFactory.getLogger("main")
    println("--- PARTE 1 ---")
    val persona1 = Persona("12345A")
    persona1.addCuenta(Cuenta(1,0.00))
    persona1.addCuenta(Cuenta(2,700.00))
    logger.info("Saldo Cuenta 1 >> ${persona1.cuentas[0].saldoDisponible}")
    logger.info("Saldo Cuenta 2 >> ${persona1.cuentas[1].saldoDisponible}")
    persona1.cuentas[0].recibirAbono(1100.00)
    persona1.cuentas[1].realizarPago(750.00)
    logger.info("Saldo Cuenta 1 >> ${persona1.cuentas[0].saldoDisponible}")
    logger.info("Saldo Cuenta 2 >> ${persona1.cuentas[1].saldoDisponible}")
    println(if (Cuenta.esMorosa(persona1)) "Cuenta es Morosa" else "Cuenta NO es Morosa")
    println("--- PARTE 2 ---")
    persona1.cuentas[0].realizarPago(1100.00)
    persona1.cuentas[1].recibirAbono(1100.00)
    println(persona1)
    logger.info("Saldo Cuenta 1 >> ${persona1.cuentas[0].saldoDisponible}")
    logger.info("Saldo Cuenta 2 >> ${persona1.cuentas[1].saldoDisponible}")
}