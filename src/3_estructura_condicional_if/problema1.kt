package `3_estructura_condicional_if`

/*
Se ingresan tres notas de un alumno, si el promedio es mayor o igual a siete mostrar un mensaje "Promocionado".

 */
fun main() {
    print("ingrese el primer valor:")
    val valor1 = readln().toInt()
    print("ingrese el segundo valor:")
    val valor2 = readln().toInt()
            print("ingrese el tercer valor:")
    val valor3 = readln().toInt()

    val promedio = valor1 + valor2 + valor3 /3
    if (promedio >= 7)
        print ("elestudiante esta promocionado")

}