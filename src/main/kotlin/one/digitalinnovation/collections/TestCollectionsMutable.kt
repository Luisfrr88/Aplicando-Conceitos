package one.digitalinnovation.collections

fun main() {
    val joao = funcionario("Joao", salario = 2000.0, tipocontratacao = "PJ")
    val miles = funcionario("Miles", salario = 1500.0, tipocontratacao = "CLT")
    val juca = funcionario("Juca", salario = 4000.0, tipocontratacao = "CLT")

    val funcionario = mutableListOf(joao, miles)
    funcionario.forEach { (println(it)) }

    println("_________________List__________________")

    funcionario.add(juca)
    funcionario.forEach { (println(it)) }

    println("______________________________________")
    funcionario.remove(joao)
    funcionario.forEach { (println(it)) }

    println("_____________SET______________________")

    val funcionarioset = mutableSetOf(joao,juca)

    funcionarioset.add(joao)
    funcionarioset.add(juca)

    funcionarioset.forEach{(println(it))}
}