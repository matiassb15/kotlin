package `8_estructura_repetitiva_dowhile`

fun main(){
    var acumulador = 0
    var num1 = 0
    do{
        print("ingrese un numero (9999 para terminar):")
        val numero: Int = readln().toInt()
        if (numero != 9999){
            acumulador += numero
        }
    }while (numero != 9999)
    println("numero acumulado: $acumulador")
    if (acumulador == 0) {
        println("el valor acumulado es 0")
    }   else if (acumulador > 0) {
        println("el valor acumulado es mayor a cero")
    } else
        println("el valor acumulado es menor a cero")
}