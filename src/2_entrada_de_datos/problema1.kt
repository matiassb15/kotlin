package `2_entrada_de_datos`

/*
Escribir un programa en el cual se ingresan cuatro números enteros, calcular
 e informar la suma de los dos primeros y el producto del tercero y el cuarto.
 */
fun main() {
    print("ingrese primer valor:")
    val valor1 = readln().toInt()
    print("ingrese el segundo valor:")
    val valor2 = readln().toInt()
    val suma = valor1 + valor2
    println("La suma de $valor1 y $valor2 es $suma")
    print("ingrese el tercer valor:")
    val valor3 = readln().toInt()
    print("ingrese el cuarto valor:")
    val valor4 = readln().toInt()
    val producto = valor3 * valor4
    println("El producto de $valor3 y $valor4 es $producto")
}