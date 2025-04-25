package Estructuras_condicionales_anidadas

fun main () {
    print("ingrese la cantidad de preguntas totales")
    val preguntastotales = readln().toInt()
    print("ingrese la cantidad de preguntas buenas")
    val correctas = readln().toDouble()
    val porcentaje = (correctas / preguntastotales) * 100
    println("el porcentaje es de: $porcentaje")
    if (porcentaje >= 90) {
        print("Nivel maximo")
    } else if (porcentaje >= 85) {
        print("nivel medio")
    } else if (porcentaje >= 75)
        print("nivel regular")
else
    print("fuera de nivel")

}