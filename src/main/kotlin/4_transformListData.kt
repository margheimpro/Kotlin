//Create a list of integers, transform it into a list of strings, and print them one by one
fun main() {

    val list = listOf(1, 2, 3, 4, 5, 6)
    println(list)

    list.map{it.toString()}.forEach{println("integer as String: $it")}

}