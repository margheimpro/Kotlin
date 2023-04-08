//Write a loop that prints numbers from 1 to 100, increasing by 2 (so 1, 3, 5...).
// Use two different printing functions for values below 50 and values above 50.

fun main() {
    for (i in 1 .. 100 step 2)
        if (i < 50){
            printSmallNumbers(i)
        } else {
            printBigNumbers(i)
        }
}

fun printSmallNumbers(smallNum : Int){
    println("$smallNum is < then 50")
}

fun printBigNumbers(bigNum : Int){
    println("$bigNum is > then 50")
}
