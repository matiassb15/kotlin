package `7_estructura_condicional_while`

fun main() {
    var x = 1
    var aprobados = 0
    var reprobados = 0
    while (x <= 10) {
        print("ingrese las notas de los alumnos")
        val notas:Int = readln().toInt()
        if (notas >= 7)
            aprobados = aprobados + 1
         else
             reprobados = reprobados + 1
        x = x + 1
    }
    println("la cantidad de notas mayores o iguales a 7 son: $aprobados")
    println("la cantidad de notas menores a 7 son de:$reprobados")
}