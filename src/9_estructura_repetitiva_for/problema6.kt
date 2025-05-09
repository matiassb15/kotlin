package `9_estructura_repetitiva_for`

fun main() {
    print("Ingrese cuántos puntos desea registrar: ")
    val puntos = readln().toInt()

    var cuadrante1 = 0
    var cuadrante2 = 0
    var cuadrante3 = 0
    var cuadrante4 = 0

    for (i in 1..puntos) {
        print("Coordenada x: ")
        val x = readln().toInt()
        print("Coordenada y: ")
        val y = readln().toInt()

        when {
            x > 0 && y > 0 -> cuadrante1++
            x < 0 && y > 0 -> cuadrante2++
            x < 0 && y < 0 -> cuadrante3++
            x > 0 && y < 0 -> cuadrante4++
        }
    }

    println("Puntos por cuadrante:")
    println("Cuadrante I: $cuadrante1")
    println("Cuadrante II: $cuadrante2")
    println("Cuadrante III: $cuadrante3")
    println("Cuadrante IV: $cuadrante4")
}