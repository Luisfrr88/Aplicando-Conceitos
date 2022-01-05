package one.digitalinnovation.collections

fun main() {
    val nomes = Array<String>(3){""}

    nomes[0] = "Maria"
    nomes[1] = "Joao"
    nomes[2] = "Pedro"

   for (nome in nomes) {
    println(nome)
}

    println("---------------------------------------------------------")
    nomes.sort()
    nomes.forEach{ println(it) }

    println("---------------------------------------------------------")
    val nomes2 = arrayOf("pedro", "Luccas", "Rodrigo" , "Milena")
    for (nome2 in nomes2)
        println(nome2)

}