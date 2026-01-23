package ejercicio5

fun main() {
    val tablero = Tablero()
    val juego = Juego()
    var ganador = 0
    do {
        val (a1,a2) = juego.pedirJugador1()
        tablero.agregarFicha(a1,a2,1)
        tablero.mostrarTablero()
        val acomprobacion1 = juego.comprobarVictoriaHorizontal(tablero)
        val acomprobacion2 = juego.comprobarVictoriaVertical(tablero)
        val acomprobacion3 = juego.comprobarVictoriaParalelo(tablero)
        ganador = juego.comprobarVictoria(acomprobacion1,acomprobacion2,acomprobacion3)
        val (b1,b2) = juego.pedirJugador2()
        tablero.agregarFicha(b1,b2,2)
        tablero.mostrarTablero()
        val bcomprobacion1 = juego.comprobarVictoriaHorizontal(tablero)
        val bcomprobacion2 = juego.comprobarVictoriaVertical(tablero)
        val bcomprobacion3 = juego.comprobarVictoriaParalelo(tablero)
        ganador = juego.comprobarVictoria(bcomprobacion1,bcomprobacion2,bcomprobacion3)
    } while (ganador != 0)
    println("--- FIN DEL JUEGO ---")
    println("Ganador >> Jugador $ganador")
}