package `6_condiciones_compuestas operadores_logicos`

fun main() {
    print("ingrese primer valor:")
    val num1: Int = readln().toInt()
    print("ingrese segundo valor")
    val num2: Int = readln().toInt()
    print("ingrese el tercer valor")
    val num3: Int = readln().toInt()
    if(num1>10 && num2>10 && num3>10)
        print("los numeros son mayores a 10")
    else
        print("algun numero es menor a 10")
}