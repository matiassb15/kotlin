package `10_estructura_condicional_when`

fun main() {
    var sumaMayores = 0

    for (i in 1..5) {
        println("Lista $i:")
        print("Ingrese el primer valor entero: ")
        val num1 = readLine()!!.toInt()
        print("Ingrese el segundo valor entero: ")
        val num2 = readLine()!!.toInt()
        print("Ingrese el tercer valor entero: ")
        val num3 = readLine()!!.toInt()

        val mayor = when {
            num1 >= num2 && num1 >= num3 -> num1
            num2 >= num1 && num2 >= num3 -> num2
            else -> num3
        }

        println("Mayor valor de la lista $i: $mayor")
        sumaMayores += mayor
    }

    println("Suma de los mayores valores de cada lista: $sumaMayores")
}