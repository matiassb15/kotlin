package Estructuras_condicionales_anidadas

fun main (){
    print("ingrese la primer nota:")
    val nota1 = readln().toInt()
    print("ingrese la segunda nota:")
    val nota2 = readln().toInt()
    print("ingrese la tercer nota:")
    val nota3 = readln().toInt()
    val promedio = (nota1 + nota2 +nota3) / 3
    if (promedio >= 7)
        print("promocionado")
    else
        if (promedio >= 4)
            print("regular")
    else
        print("reprobado")
}