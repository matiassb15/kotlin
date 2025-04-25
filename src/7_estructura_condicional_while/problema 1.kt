package `7_estructura_condicional_while`

fun main() {
    var x = 1
    var mayores = 0
    var menores = 0
    while (x <= 10) {
        print("ingrese3 una nota")
        val nota = readln().toInt()
        if (nota >= 7) {
            mayores++
        } else {
            menores
        }
        x++
    }
    println("la cantidad de notas mayores o iguales a 7 son: $mayores")
    println("la cantidad de notas menores a 7 son de:$menores")
}