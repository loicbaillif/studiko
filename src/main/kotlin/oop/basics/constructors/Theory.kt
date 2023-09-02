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

    println("\n*** 2) Default and named arguments")
    val size2 = Size1()
    size2.introduce()

    println("\n***** End of theory *****")
}


class Size1(val height: Int = 2, val width: Int = 4) {
    val area: Int = height * width

    fun introduce() {
        println("My properties: \n\t. height = $height\n\t. width = $width\n\t. area = $area\n")
    }
}