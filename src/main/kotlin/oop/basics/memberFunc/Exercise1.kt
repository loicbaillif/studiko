package oop.basics.memberFunc

/**
 * Exercise: Bugs in a vinyl store
 * https://hyperskill.org/learn/step/20649
 * @author JetBrains Academy
 * Solution by Loïc Baillif
 */

fun exercise1() {
    println("*** Exercise: Bugs in a vinyl store ***")



    println("\n*** End of exercise ***")

}


class VinylStore(vinyl: String) {
    fun printVinyl() {
        println(this.vinyl)
    }
}