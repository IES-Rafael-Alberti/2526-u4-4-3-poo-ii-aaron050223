package ejercicio5

class Juego {
    fun pedirJugador1(): Pair<Int, Int> {
        println("Fila (Jugador 1): ")
        val fila = (readln().toInt()) - 1
        println("Columna (Jugador 1): ")
        val columna = (readln().toInt()) - 1
        return Pair(fila,columna)
    }
    fun pedirJugador2(): Pair<Int, Int> {
        println("Fila (Jugador 2): ")
        val fila = (readln().toInt()) - 1
        println("Columna (Jugador 2): ")
        val columna = (readln().toInt()) - 1
        return Pair(fila,columna)
    }
    fun comprobarTablero(tablero: Tablero): Boolean {
        var contador = 0
        for (i in tablero.tablero) for (j in i) if (j == "-") contador++
        return contador > 0
    }
    fun comprobarVictoriaHorizontal(tablero: Tablero): Int {
        for (fila in tablero.tablero) {
            if (fila[0] != "-" && fila.all { it == fila[0] }) {
                return if (fila[0] == "X") 1 else 2
            }
        }
        return 0
    }
    fun comprobarVictoriaVertical(tablero: Tablero): Int {
        for (i in 0..2) {
            if (tablero.tablero[0][i] == tablero.tablero[1][i] && tablero.tablero[1][i] == tablero.tablero[2][i]) {
                when {
                    tablero.tablero[0][i] == "X" -> return 1
                    tablero.tablero[0][i] == "O" -> return 2
                }
            }
        }
        return 0
    }
    fun comprobarVictoriaParalelo(tablero: Tablero): Int {
        if (tablero.tablero[0][0] == tablero.tablero[1][1] && tablero.tablero[1][1] == tablero.tablero[2][2]) {
            when {
                tablero.tablero[0][0] == "X" -> return 1
                tablero.tablero[0][0] == "O" -> return 2

            }
        } else if (tablero.tablero[0][2] == tablero.tablero[1][1] && tablero.tablero[1][1] == tablero.tablero[2][0]) {
            when {
                tablero.tablero[0][2] == "X" -> return 1
                tablero.tablero[0][2] == "O" -> return 2

            }
        }
        return 0
    }
    fun comprobarVictoria(comprobacion1: Int, comprobacion2: Int, comprobacion3: Int): Int {
        val lista = listOf(comprobacion1, comprobacion2, comprobacion3)
        for (i in lista) {
            if (i == 1) return 1 else if (i == 2) return 2
        }
        return 0
    }
}