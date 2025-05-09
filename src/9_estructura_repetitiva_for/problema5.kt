package `9_estructura_repetitiva_for`

fun main() {
    print("¿Cuántos triángulos ingresará?: ")
    val cantidad = readln().toInt()

    var equilatero = 0
    var isosceles = 0
    var escaleno = 0

    for (i in 1..cantidad) {
        print("Lado A: ")
        val a = readln().toInt()
        print("Lado B: ")
        val b = readln().toInt()
        print("Lado C: ")
        val c = readln().toInt()

        if (a == b && b == c) {
            println("Triángulo equilátero")
            equilatero++
        } else if (a == b || b == c || a == c) {
            println("Triángulo isósceles")
            isosceles++
        } else {
            println("Triángulo escaleno")
            escaleno++
        }
    }

    println("Equiláteros: $equilatero")
    println("Isósceles: $isosceles")
    println("Escalenos: $escaleno")
}