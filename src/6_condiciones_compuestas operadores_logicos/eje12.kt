package `6_condiciones_compuestas operadores_logicos`

fun main() {
    print("ingrese primer valor:")
    val num1: Int = readln().toInt()
    print("ingrese segundo valor")
    val num2: Int = readln().toInt()
    print("ingrese el tercer valor")
    val n3: Int = readln().toInt()
    if (num1 > num2 && num1 > n3)
        print(num1)
    else
        if (num2 > n3)
            print(num2)
    else
        print(n3)
}