package `6_condiciones_compuestas operadores_logicos`

fun main() {
    print("ingrse un dia")
    val dia: Int = readln().toInt()
    print("ingrerse un mes")
    val mes: Int = readln().toInt()
    if (mes == 12 && dia == 24 || dia == 25)
        print("ya es navidad")
    else
        print("aun no es navidad")
}