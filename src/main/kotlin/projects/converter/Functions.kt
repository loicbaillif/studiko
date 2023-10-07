package projects.converter


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
    return when (decNum) {
        10 -> 'A'
        11 -> 'B'
        12 -> 'C'
        13 -> 'D'
        14 -> 'E'
        15 -> 'F'
        else -> decNum.digitToChar()
    }
}


fun mainMenu() {
    var userMenu = ""
    while (userMenu != "/exit") {
        println(PROMPT_STAGE2)
        userMenu = readln()

        when (userMenu) {
            "/from" -> println("/from selected ...")
            "/to" -> println("/to selected ...")
            "/exit" -> continue
            else -> println("Not a valid option ...")
        }
    }
}