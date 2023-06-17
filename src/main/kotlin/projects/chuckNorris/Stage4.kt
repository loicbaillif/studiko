package projects.chuckNorris

/**
 * Stage 4/5 : Try to understand it
 * https://hyperskill.org/projects/300/stages/1689/implement
 * @author JetBrains Academy
 * Solution by Loïc Baillif
 */

fun stage4() {
    val result = decodeNorris("0 0 00 0000 0 000 00 0000 0 00") // DEBUG
    println(result)
}


fun decodeNorris(input: String): String {
    val stringToList = input.split(" ")
    var index = 0
    var result = ""
    println(stringToList) // DEBUG

    do {
        val bit = if (stringToList[index++] == "0") "1" else "0" // Get digit
        for (nbBits in 0..stringToList[index].lastIndex) result += bit // Get nb of digits
        index++
    } while (index <= stringToList.lastIndex)


    return result
}