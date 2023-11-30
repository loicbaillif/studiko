package oop.basics.memberFunc

/**
 * Exercise: Volume of a cube
 * https://hyperskill.org/learn/step/6369
 * @author JetBrains Academy
 * Solution by Loïc Baillif
 */

fun exercise2() {
    println("*** Exercise: Volume of a cube ***")



    println("\n*** End of exercise ***")
}


class Box(var height: Double, var width: Double, var length: Double) {

    // write the getVolume method here
    fun getVolume() = height * width * length
}