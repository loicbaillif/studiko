package oop.basics.memberFunc

/**
 * Exercise: Volume of a cube
 * https://hyperskill.org/learn/step/6369
 * @author JetBrains Academy
 * Solution by Loïc Baillif
 */

fun exercise2() {
    println("*** Exercise: Volume of a cube ***")

    val box1 = Box(12.3, 2.1, 3.5)
    println(box1.getVolume())

    println("\n*** End of exercise ***")
}


class Box(var height: Double, var width: Double, var length: Double) {

    // write the getVolume method here
    fun getVolume() = height * width * length
}