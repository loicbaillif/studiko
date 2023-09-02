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
    val size3 = Size1(width = 8)
    size3.introduce()


    println("\n*** 3) Single line class")
    val size4 = Size2(5, 5)


    println("\n*** 4) Init")
    val size5 = Size3(5, -2)


    println("\n***** End of theory *****")
}


class Size1(val height: Int = 2, val width: Int = 4) {
    val area: Int = height * width

    fun introduce() {
        println("My properties: \n\t. height = $height\n\t. width = $width\n\t. area = $area\n")
    }
}

class Size2(val height: Int = 3, val width: Int = 1)


class Size3(_width: Int, _height: Int) {
    var width: Int = 0

    init {
        println("I am initialized with width = $width")
    }


    var height: Int = 0


    init {
        width = if (_width >= 0) _width else {
            println("Error, the width should be a non-negative value")
            0
        }
        height = if (_height >= 0) _height else {
            println("Error, the height should be a non-negative value")
            0
        }
    }
}