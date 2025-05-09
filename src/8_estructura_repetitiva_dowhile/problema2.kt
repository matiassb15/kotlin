package `8_estructura_repetitiva_dowhile`

fun main() {
    var numeroCuenta: Int
    var saldo: Int
    var sumaAcreedores = 0

    do {
        print("Número de cuenta (negativo para terminar): ")
        numeroCuenta = readLine()!!.toInt()
        if (numeroCuenta >= 0) {
            print("Saldo actual: ")
            saldo = readLine()!!.toInt()
            when {
                saldo > 0 -> {
                    println("Cuenta $numeroCuenta: Acreedor")
                    sumaAcreedores += saldo
                }
                saldo < 0 -> println("Cuenta $numeroCuenta: Deudor")
                else -> println("Cuenta $numeroCuenta: Nulo")
            }
        }
    } while (numeroCuenta >= 0)

    println("La suma total de los saldos acreedores es: $sumaAcreedores")
}