package `9_estructura_repetitiva_for`

fun main() {
    var numeros = IntArray(10)
    for (i in 0..9) {
        print("Ingrese número: ")
        numeros[i] = readln().toInt()
    }

    var suma = 0
    for (i in 5..9) {
        suma += numeros[i]
    }

    println("La suma de los últimos 5 valores es: $suma")
}