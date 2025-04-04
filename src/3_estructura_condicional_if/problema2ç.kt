package `3_estructura_condicional_if`

fun main() {
    print("ingrese numeros entre el 1 y el 99")
    val num = readln().toInt()
    if (num<= 9){
        print("el numero digitado es de un solo digito")
    }else{
        print("el numero digitado tiene dos digitos")
    }
}