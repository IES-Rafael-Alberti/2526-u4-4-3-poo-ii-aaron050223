package ejercicio2

class Cuenta(
    val numero: Int,
    var saldoDisponible: Double
) {
    fun recibirAbono(cantidad: Double) {
        saldoDisponible += cantidad
    }

    fun realizarPago(cantidad: Double) {
        saldoDisponible -= cantidad
    }

    companion object {
        fun esMorosa(persona: Persona): Boolean {
            var morosa = false
            for (cuenta in persona.cuentas) {
                if (cuenta.saldoDisponible < 0) {
                    morosa = true
                }
            }
            return morosa
        }
        fun transferencia(
            personaDar: Persona,
            personaRecibir: Persona,
            idDar: Int,
            idRecibir: Int,
            cantidad: Double
        ): Boolean {
            val cuentaDar = personaDar.cuentas.find {it.numero == idDar}
            val cuentaRecibir = personaRecibir.cuentas.find {it.numero == idRecibir}
            if (cuentaDar != null && cuentaRecibir != null && cuentaDar.saldoDisponible >= cantidad) {
                cuentaDar.realizarPago(cantidad)
                cuentaRecibir.recibirAbono(cantidad)
                return true
            }
            return false
        }
    }
}