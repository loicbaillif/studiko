package projects.chuckNorris

/**
 * Stage 4/5 : Try to understand it
 * https://hyperskill.org/projects/300/stages/1689/implement
 * @author JetBrains Academy
 * Solution by Loïc Baillif
 */

fun stage4() {
    println("Input encoded string:")
    val result = norrisToBinary(readln())
    println("\nThe result:")
    decodeBinary(result)
}


fun decodeBinary(input: String) {
    val listChars = input.chunked(7)
    for (letter in listChars) print(string7ToBinary(letter).toChar())
    println()
}


fun norrisToBinary(input: String): String {
    val stringToList = input.split(" ")
    var index = 0
    var result = ""

    do {
        val bit = if (stringToList[index++] == "0") "1" else "0" // Get digit
        for (nbBits in 0..stringToList[index].lastIndex) result += bit // Get nb of digits
        index++
    } while (index < stringToList.lastIndex)

    return result
}


fun string7ToBinary(input: String): Int {
    // Convert string of 7 bits to an Int
    var result = 0
    for (i in 0..6) {
        result += input[i].digitToInt()
        if (i != 6) result *= 2
    }
    return result
}