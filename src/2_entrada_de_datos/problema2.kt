package `2_entrada_de_datos`

/*
Realizar un programa que lea por teclado cuatro valores
 numéricos enteros e informe su suma y promedio.
 */
fun main() {
    print("ingrese primer valor:")
    val valor1 = readln().toInt()
    print("ingrese el segundo valor:")
    val valor2 = readln().toInt()
    println("imgrese el tercer valor")
    val valor3 = readln().toInt()
    print("ingrese el cuarto valor")
    val valor4 = readln().toInt()
    val suma = valor1 + valor2 + valor3 + valor4
    println("La suma de los valores es $suma ")
val promedio: Int = suma / 4
    println("el resultdodel promedio es $promedio")
}