package one.digitalinnovation.collections

fun main() {
    val joao = funcionario("Joao", salario = 2000.0, tipocontratacao = "PJ")
    val miles = funcionario("Miles", salario = 1500.0, tipocontratacao = "CLT")
    val juca = funcionario("Juca", salario = 4000.0, tipocontratacao = "CLT")


    val repositorio = repositorio<funcionario>()
    repositorio.create(joao.nome, joao )
    repositorio.create(miles.nome, miles)
    repositorio.create(juca.nome, juca)

    println(repositorio.findById(miles.nome))

    println("____________________________________")

    repositorio.remove(juca.nome)
    repositorio.findAll().forEach{(println(it))}


}
