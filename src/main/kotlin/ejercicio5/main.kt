package ejercicio5

fun main() {
    val tablero = Tablero()
    val juego = Juego()
    var ganador: Int

    do {
        val (a1, a2) = juego.pedirJugador1()
        tablero.agregarFicha(a1, a2, 1)
        tablero.mostrarTablero()
        ganador = juego.comprobarVictoria(juego.comprobarVictoriaHorizontal(tablero), juego.comprobarVictoriaVertical(tablero), juego.comprobarVictoriaParalelo(tablero))

        if (ganador == 0) {
            if (juego.comprobarTablero(tablero)) {
                val (b1, b2) = juego.pedirJugador2()
                tablero.agregarFicha(b1, b2, 2)
                tablero.mostrarTablero()
                ganador = juego.comprobarVictoria(juego.comprobarVictoriaHorizontal(tablero), juego.comprobarVictoriaVertical(tablero), juego.comprobarVictoriaParalelo(tablero))
            }
        }

    } while (ganador == 0 && juego.comprobarTablero(tablero))

    println("--- FIN DEL JUEGO ---")
    if (ganador != 0) println("Ganador >> Jugador $ganador") else println("Empate")
}