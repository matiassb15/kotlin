package `7_estructura_condicional_while`

fun main() {
    print("ingrese la cantidad de personas:")
    val personas = readln().toInt()
    var x = 1
    var total = 0.0
    while (x <= personas){
        print("digite la alturade la persona")
        val altura = readln().toDouble()
        total = total + altura
        x = x + 1
    }
    val promedio = total / personas
    print("el profedio de altura fue de: $promedio")
}