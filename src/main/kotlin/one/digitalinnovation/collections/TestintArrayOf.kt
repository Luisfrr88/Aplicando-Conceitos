package one.digitalinnovation.collections

fun main() {
    val value = intArrayOf(2, 3, 5, 6, 1, 2, 19)

    value.forEach {
        println(it)
    }
    println("__________________________________")
value.sort()
    value.forEach {
        println(it)
    }

}