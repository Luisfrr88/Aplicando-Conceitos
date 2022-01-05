package one.digitalinnovation.collections

fun main() {
    val joao = funcionario("Joao", salario = 1000.0)
    val miles = funcionario("Miles", salario = 2000.0)
    val juca = funcionario("Juca", salario = 4000.0)

    val funcionarios = listOf(joao, miles, juca)

    funcionarios.forEach{(println(it))}
    println("__________________________________________")
    println(funcionarios.find{ it == miles })
}

data class funcionario(
    val nome: String,
    val salario: Double
) {
    override fun toString(): String = """
        Nome: $nome
        Salário: $salario
    """.trimIndent()
    }
