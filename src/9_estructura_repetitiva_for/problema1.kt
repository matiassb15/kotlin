package `9_estructura_repetitiva_for`

fun main() {
    print("¿Cuántos triángulos ingresará?: ")
    val cantidad = readln().toInt()
    var mayoresA12 = 0

    for (i in 1..cantidad) {
        print("Ingrese base del triángulo: ")
        val base = readln().toDouble()
        print("Ingrese altura del triángulo: ")
        val altura = readln().toDouble()

        val superficie = (base * altura) / 2
        println("Base: $base, Altura: $altura, Superficie: $superficie")

        if (superficie > 12)
            mayoresA12++
    }

    println("Cantidad de triángulos con superficie mayor a 12: $mayoresA12")

}