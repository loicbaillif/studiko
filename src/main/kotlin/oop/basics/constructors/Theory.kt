package oop.basics.constructors

/**
 * Theory: Constructors
 * https://hyperskill.org/learn/step/10740
 * @author JetBrains Academy
 */

fun theory() {
    println("***** Theory *****")

    println("\n*** 1) Default Constructor")
    val size1 = Size1(1, 2)
    size1.introduce()

    println("\n***** End of theory *****")
}


class Size1(val height: Int, val width: Int) {
    val area: Int = height * width

    fun introduce() {
        println("height = $height\twidth = $width\tarea = $area")
    }
}