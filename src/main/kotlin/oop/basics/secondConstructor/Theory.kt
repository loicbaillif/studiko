package oop.basics.secondConstructor

/**
 * Secondary Constructor: Theory
 * https://hyperskill.org/learn/step/10746
 * @author JetBrains Academy
 */

fun theory() {
    println("***** Theory *****")

    println("\n*** 1) Custom Constructor ***")



    println("\n***** End of theory *****")
}


class Size1 {
    var width: Int = 0
    var height: Int = 0

    constructor(_width: Int, _height: Int) {
        width = _width
        height = _height
    }
}