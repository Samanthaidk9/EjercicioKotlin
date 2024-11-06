
import java.sql.SQLOutput
import java.text.DecimalFormat

//Realizado por Kathleen Samantha Vargas Avendaño

fun main() {
    println("Ingrese su peso actual en kilogramos: ")
    var Peso: Double = readln().toDouble()
    println("Ingrese su estatura en metros: ")
    var Estatura: Double = readln().toDouble()
    var resultado: Double = Peso/ (Estatura * Estatura)

    println("Su indice de masa corporal es : ${resultado}")

    if (resultado < 16.00 ) {
        println("Delgadez severa")
    }else if (resultado >= 16.00 && resultado <=16.99){
        println("Delgadez moderada")
        }else if (resultado >= 17.00 && resultado <= 18.49){
        println("Delgadez leve")
        }else if (resultado >= 18.5 && resultado <= 24.99){
        println("Peso normal")
        }else if (resultado >= 25.00 && resultado <= 29.99){
            println("Preobeso")
        }else if (resultado >= 30.00 && resultado <= 34.99){
            println("Obesidad leve")
        }else if (resultado >= 35.00 && resultado <= 39.99){
            println("Obesidad media")
        }else if (resultado >= 40.00){
            println("Obesidad morbida")
        }else{
            println("Error")
        }
    return
}