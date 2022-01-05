package one.digitalinnovation.collections

fun main() {
    val salarios = arrayOf(
        "2000".toBigDecimal(),
        "1500".toBigDecimal(),
        "4000".toBigDecimal()
    )

    println("_______________________________________________________")

    println(salarios.somatoria())

    println("_______________________________________________________")

    println(salarios.media())


}
