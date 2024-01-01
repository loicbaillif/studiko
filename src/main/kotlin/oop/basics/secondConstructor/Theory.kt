package oop.basics.secondConstructor

/**
 * Secondary Constructor: Theory
 * https://hyperskill.org/learn/step/10746
 * @author JetBrains Academy
 */

fun theory() {
    println("***** Theory *****")

    println("\n*** 1) Custom Constructor ***")

    val size11 = Size1(3, 4)
    val size21 = Size1(5, 1)
    println(size11.introduce())
    println(size21.introduce())

    println("\n*** 2) Multiple constructors")
    val size31 = Size1(8)
    val size41 = Size1(3.2, 5)
    println(size31.introduce())
    println(size41.introduce())




    println("\n***** End of theory *****")
}


class Size1 {
    var width: Int = 0
    var height: Int = 0

    init {
        println("I have been created...")
    }

    constructor(_width: Int) {
        this.width = _width
        this.height = 2 // Default value for height
        println("Default height value applied")
    }

    constructor(_width: Int, _height: Int) {
        this.width = _width
        this.height = _height
    }

    constructor(_width: Int, _height: Double) {
        this.width = _width
        this.height = _height.toInt()
        println("Height value converted from Double ... Possible loss of accuracy")
    }

    constructor(_width: Double, _height: Int) {
        this.width = _width.toInt()
        this.height = _height
        println("Width value converted from Double ... Possible loss of accuracy")
    }

    // Methods
    fun introduce() = "\tWidth = ${this.width}\t-\tHeight = ${this.height}"
}