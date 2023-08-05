package projects.converter

fun tenToBin(input: Int): String {
    // Variable
    val sbResult = StringBuilder()
    var tempInput = input

    // Loop
    while (tempInput > 0) {
        sbResult.insert(0, (tempInput % 2).toString())
        tempInput /= 2
    }

    return sbResult.toString()
}


fun giveHexCode(decNum: Int): Char {
    when (decNum) {
        10 -> return 'A'
        11 -> return 'B'
        12 -> return 'C'
        13 -> return 'D'
        14 -> return 'E'
        15 -> return 'F'
    }
}