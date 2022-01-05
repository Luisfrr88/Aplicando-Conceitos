package one.digitalinnovation.collections

fun main() {
    val salarios = doubleArrayOf(1000.0, 2500.0, 5800.0)

    for (salario in salarios){
    println(salario)
    }
    println("-----------------------")
    println("Maior Salario: ${salarios.maxOrNull()}")
    println("Menos Salario: ${salarios.minOrNull()}")
    println("Média Salario: ${salarios.average()}")

    val salariosMaiorque2500 = salarios.filter { it > 2500.0 }
    println("-----------------------")
    salariosMaiorque2500.forEach{println(it)}

}
