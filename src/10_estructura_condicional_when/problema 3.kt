package `10_estructura_condicional_when`

fun main() {
    var equilatero = 0
    var isosceles = 0
    var escaleno = 0

    print("Ingrese la cantidad de triángulos a procesar: ")
    val n = readLine()!!.toInt()

    for (i in 1..n) {
        println("Triángulo $i:")
        print("Ingrese lado 1: ")
        val lado1 = readLine()!!.toInt()
        print("Ingrese lado 2: ")
        val lado2 = readLine()!!.toInt()
        print("Ingrese lado 3: ")
        val lado3 = readLine()!!.toInt()

        when {
            lado1 == lado2 && lado2 == lado3 -> {
                println("Triángulo equilátero")
                equilatero++
            }
            lado1 == lado2 || lado1 == lado3 || lado2 == lado3 -> {
                println("Triángulo isósceles")
                isosceles++
            }
            else -> {
                println("Triángulo escaleno")
                escaleno++
            }
        }
    }

    println("Cantidad de triángulos equiláteros: $equilatero")
    println("Cantidad de triángulos isósceles: $isosceles")
    println("Cantidad de triángulos escalenos: $escaleno")
} val   