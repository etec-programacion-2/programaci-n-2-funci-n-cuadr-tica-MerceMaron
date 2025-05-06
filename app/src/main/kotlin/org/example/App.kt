package org.example

fun main() {
    val a=5
    val b=7
    val c=3
    if (a === 0) {
        println("El valor de a no puede ser cero")
    }   
    println("La función cuadrática es: ${a}x² + ${b}x + ${c}")
    calculadora(a, b, c)
}

fun calculadora (a: Int, b: Int, c: Int){
    println("Tabla de valores:")
    println("X, Resultado de la función")
    for (x in -5..5) {
        var resultado=a*x*x+b*x+c
        val valores = arrayListOf(x, resultado)
        println(valores)
    }
}
