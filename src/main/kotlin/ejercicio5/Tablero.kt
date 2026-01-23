package ejercicio5

class Tablero {
    val tablero = Array(3) { Array(3) { "-" } }
    fun agregarFicha(fila: Int, columna: Int, jugador: Int) {
        if (jugador == 1 ) tablero[fila][columna] = "X" else tablero[fila][columna] = "O"
    }
    fun mostrarTablero() {
        for (i in 0..2) {
            println(tablero[i].joinToString(" "))
        }
    }
}