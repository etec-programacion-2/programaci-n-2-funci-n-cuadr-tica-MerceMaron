package org.example
import java.math.BigDecimal 
import java.math.RoundingMode

fun main() { 
    val a=6
    val b=12
    val c=3
    if (a === 0) {
        println("El valor de a no puede ser cero")
    }   
    println("La función cuadrática es: ${a}x² + ${b}x + ${c}")
    calculadora(a, b, c)
    discriminante(a, b, c)
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
//redondear a dos decimales las raíces
fun discriminante (a: Int, b:Int, c:Int){
    val a1 = a.toDouble()
    val b1 =b.toDouble()
    val c1 =c.toDouble()
    val resDiscriminante=b*b-4*a*c
    if (resDiscriminante === 0) {
        val raízUno: Double= (-b+ Math.sqrt(b1*b1-4*a1*c1))/2*a1
        println("La función tiene una raíz: ${raízUno}")
    } else if (resDiscriminante > 0){
        val raízUno: Double= (-b+ Math.sqrt(b1*b1-4*a1*c1))/2*a1
        val raízDos: Double= (-b- Math.sqrt(b1*b1-4*a1*c1))/2*a1
        val raízDecimal1= BigDecimal(raízUno.toString()).setScale(2, RoundingMode.HALF_UP)
        val raízDecimal2= BigDecimal(raízDos.toString()).setScale(2, RoundingMode.HALF_UP)
        println("La función tiene dos raíces: ${raízDecimal1}, ${raízDecimal2}")
    } else {
        println("La función no tiene raíces reales")
    }
}
