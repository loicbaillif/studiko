package projects.converter

fun tenToBin(input: Int): String {
    // Variables
    val sbResult = StringBuilder()
    var tempInput = input

    // Loop
    while (tempInput > 0) {
        sbResult.insert(0, (tempInput % 2).toString())
        tempInput /= 2
    }

    return sbResult.toString()
}


fun tenToElse(input: Int, radix: Int): String {
    // Variables
    val sbResult = StringBuilder()
    var tempInput = input
    var digit: Int

    // Loop
    while (tempInput > 0) {
        digit = tempInput % radix
        sbResult.insert(0, if (digit > 9) giveHexCode(digit) else digit)
        tempInput /= radix
    }

    // Result
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
        else -> return decNum.digitToChar()
    }
}