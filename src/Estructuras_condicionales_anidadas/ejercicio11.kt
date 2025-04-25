package Estructuras_condicionales_anidadas

fun main () {
    print("ingrese la primer nota:")
    val nota1 = readln().toInt()
    print("ingrese la segunda nota:")
    val nota2 = readln().toInt()
    print("ingrese la tercer nota:")
    val nota3 = readln().toInt()
    val promedio = (nota1 + nota2 + nota3) / 3

    val estado = if (promedio >= 7) "promocionado"
    else if (promedio >= 4) "Regular" else "reprobado"
    print("Estado del alumno $estado")
}