package ejercicio2

class Persona(
    val dni: String,
) {
    var cuentas: MutableList<Cuenta> = mutableListOf()
        set(value) {
            if (value.size <= 3) field = value
        }

    fun addCuenta(cuenta: Cuenta) {
        if (cuentas.size <= 3) cuentas.add(cuenta)
    }
}