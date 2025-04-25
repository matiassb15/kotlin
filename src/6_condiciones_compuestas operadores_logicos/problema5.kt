package `6_condiciones_compuestas operadores_logicos`

fun main() {
    print("ingrese primer valor:")
    val num1: Int = readln().toInt()
    print("ingrese segundo valor")
    val num2: Int = readln().toInt()
    print("ingrese el tercer valor")
    val num3: Int = readln().toInt()
    val mayor
    = if (num1 > num2 && num1 > num3) num1 else if (num2 > num3) num2 else num3
    val menor = if (num1 < num2 && num1 < num3) num1 else if (num2 < num3) num2 else num3
    print("el numero es: $mayor")
    print("el numero es:$menor")

}
