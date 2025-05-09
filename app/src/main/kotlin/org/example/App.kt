package org.example
//se importan las librerias de Java que luego se usarán para redondear las raíces a dos decimales
import java.math.BigDecimal 
import java.math.RoundingMode

//se define la función principal, los valores de los coeficientes a, b, c y la llamada a las demás funciones
fun main() { 
    val a=6
    val b=12
    val c=3

    //se verifica que el valor de a no sea cero
    if (a === 0) { 
        println("El valor de a no puede ser cero")
    }   

    //se muestra la función cuadrática
    println("La función cuadrática es: ${a}x² + ${b}x + ${c}") 
    calculadora(a, b, c)
    discriminante(a, b, c)
}

//se define la función que calcula los valores de la función cuadrática para x entre -5 y 5
fun calculadora (a: Int, b: Int, c: Int){
    println("Tabla de valores:")
    println("X, Resultado de la función")

    //se realiza un for para recorrer los valores de x entre -5 y 5
    for (x in -5..5) { 
        var resultado=a*x*x+b*x+c

        //se agregan a una lista el valor de x y el resultado de la función cuadrática
        val valores = arrayListOf(x, resultado) 
        println(valores)
    }
}

//se define la función que calcula el discriminante y las raíces de la función cuadrática
fun discriminante (a: Int, b:Int, c:Int){

    //se convierten los coeficientes a Double para poder trabajar con decimales
    val a1 = a.toDouble() 
    val b1 =b.toDouble()
    val c1 =c.toDouble()

    //se calcula el discriminante
    val resDiscriminante=b*b-4*a*c 

    //se analizan los diferentes resultados del discriminante y a partir de eso se devuelven diferentes resultados
    if (resDiscriminante === 0) { 
        val raízUno: Double= (-b+ Math.sqrt(b1*b1-4*a1*c1))/2*a1
        println("La función tiene una raíz: ${raízUno}")
    } else if (resDiscriminante > 0){
        val raízUno: Double= (-b+ Math.sqrt(b1*b1-4*a1*c1))/2*a1
        val raízDos: Double= (-b- Math.sqrt(b1*b1-4*a1*c1))/2*a1

        //se utiliza el método BigDecimal y RoundingMode.HALF_UP para que los decimales se redondeen a dos decimales
        val raízDecimal1= BigDecimal(raízUno).setScale(2, RoundingMode.HALF_UP)
        val raízDecimal2= BigDecimal(raízDos).setScale(2, RoundingMode.HALF_UP)
        println("La función tiene dos raíces: ${raízDecimal1}, ${raízDecimal2}")
    } else {
        println("La función no tiene raíces reales")
    }
}
