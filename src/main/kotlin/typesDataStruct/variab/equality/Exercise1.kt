package typesDataStruct.variab.equality

fun exercise1() {
    // https://hyperskill.org/learn/step/11242
    // Kings of Sweden
    println("*** Exercise: Kings of Sweden ***")

    val kingCharlesTheEleventh = Human()
    val kingCarolusRex = Human()

    val king = kingCharlesTheEleventh
    king = kingCarolusRex

    println("\n*** End of exercise ***")
}