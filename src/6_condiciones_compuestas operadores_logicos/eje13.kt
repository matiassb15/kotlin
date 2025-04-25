package `6_condiciones_compuestas operadores_logicos`

fun main() {
    print("ingrse un dia")
    val dia: Int = readln().toInt()
    print("ingrerse un mes")
    val mes: Int = readln().toInt()
    print ("ingrese un año")
    val año: Int = readln().toInt()
    if (mes == 1 || mes == 2 || mes == 3)
        print("corresponde al primer trimestre");
}