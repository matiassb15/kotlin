package `9_estructura_repetitiva_for`

fun main() {
    var suma = 0
    for(i in 1 .. 10){
        print("ingrese un valor")
        val valor = readln().toInt()
        suma += valor
    }
    println("la suma de los valores es $suma")
    val promedio = suma / 10
    println("su promedio es $promedio")
}