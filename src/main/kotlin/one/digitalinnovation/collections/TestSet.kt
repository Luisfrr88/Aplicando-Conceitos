package one.digitalinnovation.collections

fun main() {
    val joao = funcionario("Joao", salario = 2000.0, tipocontratacao = "PJ")
    val miles = funcionario("Miles", salario = 1500.0, tipocontratacao = "CLT")
    val juca = funcionario("Juca", salario = 4000.0, tipocontratacao = "CLT")

    val funcionario1 = setOf(joao, miles)
    val funcionario2 = setOf(juca)

    val resultUnion = funcionario1.union(funcionario2)
    resultUnion.forEach { (println(it)) }
    println("--------------------------------------")

    val funcionario3 = setOf(joao, miles, juca)
    val subtract = funcionario3.subtract(funcionario2)
    subtract.forEach { (println(it)) }

    println("--------------------------------------")
    val intersect = funcionario3.intersect(funcionario2)
    intersect.forEach { (println(it)) }







}