package `8_estructura_repetitiva_dowhile`

fun main() {
    var opcion: Int

    do {
        println("\nMenú:")
        println("1. Sumar dos números")
        println("2. Restar dos números")
        println("3. Multiplicar dos números")
        println("4. Dividir dos números")
        println("5. Salir")
        print("Elige una opción: ")
        opcion = readLine()!!.toInt()

        if (opcion in 1..4) {
            print("Ingresa el primer número: ")
            val num1 = readLine()!!.toDouble()
            print("Ingresa el segundo número: ")
            val num2 = readLine()!!.toDouble()

            when (opcion) {
                1 -> println("Resultado: ${num1 + num2}")
                2 -> println("Resultado: ${num1 - num2}")
                3 -> println("Resultado: ${num1 * num2}")
                4 -> {
                    if (num2 != 0.0) {
                        println("Resultado: ${num1 / num2}")
                    } else {
                        println("Error: No se puede dividir entre cero")
                    }
                }
            }
        } else if (opcion != 5) {
            println("Opción inválida")
        }
    } while (opcion != 5)

    println("¡Hasta luego!")
}