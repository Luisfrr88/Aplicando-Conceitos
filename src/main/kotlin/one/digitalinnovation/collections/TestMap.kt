package one.digitalinnovation.collections

fun main() {
    val pair: Pair<String, Double> = (Pair("João",1000.0))
    val map1= arrayOf(pair)

    map1.forEach { (k,v) -> println("Chave: $k - Valor:$v ") }

    val map2 = mapOf("miles" to 2500.0,"Juca"  to 3500.0)

    map2.forEach{(k,v) -> println("Chave:$k - Valor: $v")}

}
