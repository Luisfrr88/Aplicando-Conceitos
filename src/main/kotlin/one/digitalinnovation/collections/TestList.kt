package one.digitalinnovation.collections

fun main() {
    val joao = funcionario("Joao", salario = 2000.0, tipocontratacao = "PJ")
    val miles = funcionario("Miles", salario = 1500.0, tipocontratacao = "CLT")
    val juca = funcionario("Juca", salario = 4000.0, tipocontratacao = "CLT")

    val funcionarios = listOf(joao, miles, juca)

    funcionarios.forEach{(println(it))}
    println("__________________________________________")
    println(funcionarios.find{ it == miles })

    println("__________________________________________")
funcionarios
    .sortedBy { it.salario}
    .forEach{(println(it))}

    println("__________________________________________")
    funcionarios
        .groupBy { it.tipocontratacao}
        .forEach{(println(it))}
}
