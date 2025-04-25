package Estructuras_condicionales_anidadas

fun main() {
    print("ingreseun numero entero")
    val numero = readln().toInt()
    if (numero > 0)
        print("el numero es positivo")
    else if (numero < 0)
        print("el numero es negativo")
    else (numero == 0)
        print("es nulo")
}