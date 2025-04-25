package Estructuras_condicionales_anidadas

fun main() {
    print("ingrese su edad su edad:")
    val edad: Int = readln().toInt()
    if (edad <= 13) {
        print("es niño")
    } else {
        if (edad > 13)
            print("es un adolecente")
        if (edad >= 17)
            print("es adolecente")
    }
    if (edad >= 18) {
        print("es un adulto")

    }
}