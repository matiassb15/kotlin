package `6_condiciones_compuestas operadores_logicos`

import kotlin.math.pow as d

fun main() {
    print("ingrese primer valor:")
    val num1: Int = readln().toInt()
    print("ingrese segundo valor")
    val num2: Int = readln().toInt()
    print("ingrese el tercer valor")
    val num3: Int = readln().toInt()
    val valorcubo = (num1*num2*num3)
    if (num1 == num2 && num2 == num3 && num1 == num3 )
      print("el valor del cubo es $valorcubo")
    else
        print("no tiene valor cubico")

}