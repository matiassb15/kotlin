package `9_estructura_repetitiva_for`

fun main() {
    print("Ingrese un valor del 1 al 10: ")
    val valor = readln().toInt()

    for (i in 1..10) {
        println("$valor x $i = ${valor * i}")
    }
}