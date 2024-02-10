package projects.bullsCows

import java.lang.NumberFormatException
import java.util.Random

fun assessNumber(userNumber: String, solution: String): List<Int> {
    var bulls = 0
    var cows = 0

    repeat(userNumber.length) {
        if (userNumber[it] == solution[it]) {
            bulls++
        } else if (solution.contains(userNumber[it])) cows++
    }

    return listOf(bulls, cows)
}


fun displayCodeFormat(codeLength: Int, nbSymbols: Int): String {
    var codeFormat = ""
    repeat(codeLength) {
        codeFormat += "*"
    }

    codeFormat += " (0-"
    if (nbSymbols <= 10) codeFormat += (nbSymbols - 1) else codeFormat += "9"
    if (nbSymbols == 11) codeFormat += ", a"
    if (nbSymbols > 11) codeFormat += ", a-${ALPHABET[nbSymbols-1]}"

    codeFormat += ")."

    return codeFormat
}


fun formatResult(bullsCows: List<Int>): String {
    if (bullsCows == listOf(0, 0)) return "None"
    if (bullsCows[0] == 0) return "${bullsCows[1]} cow%s".format(if (bullsCows[1] == 1) "" else "s")
    if (bullsCows[1] == 0) return "${bullsCows[0]} bull%s".format(if (bullsCows[0] == 1) "" else "s")
    return "${bullsCows[0]} bull%s and ${bullsCows[1]} cow%s".format(
        if (bullsCows[0] == 1) "" else "s",
        if (bullsCows[1] == 1) "" else "s"
    )
}


fun getCode(codeLength: Int): String {
    var index = 0
    var nanoTime = getNanoTime()
    var result = ""
    while (result.length < codeLength) {
        if (result == "") {
            while (nanoTime[index] == '0') index++
        }
        if (!result.contains(nanoTime[index])) result += nanoTime[index]

        if (++index == nanoTime.length) {
            nanoTime = getNanoTime()
            index = 0
        }
    }

    return result
}


fun getNanoTime(): String {
    val nanoTime = System.nanoTime().toString()
    return nanoTime.reversed()
}


fun getNumberSymbols(codeLength: Int): Int {
    val numberSymbols = getPositiveInt(INVALID_NUMBER)

    if (numberSymbols == -1) {
        return 0
    }

    if (numberSymbols > 36) {
        println(INVALID_TOO_MANY_SYMBOLS)
        return 0
    }

    if (numberSymbols < codeLength) {
        println(INVALID_TOO_FEW_SYMBOLS.format(codeLength, numberSymbols))
        return 0
    }

    return numberSymbols
}


fun getPasswordLength(): Int {
    val passwordSize = getPositiveInt()

    if (passwordSize == -1) {
        println("Error: Not a valid length")
        return -1
    }

    if (passwordSize > 36) {
        println(INVALID_PASSWORD_LENGTH.format(passwordSize))
        return -1
    }
    if (passwordSize < 1) {
        println(INVALID_LENGTH_NEGATIVE)
        return -1
    }

    return passwordSize
}


fun getPositiveInt(errorMessage: String): Int {
    var result = -1
    val userInput = readln()

    try {
        result = userInput.toInt()
    } catch (e: NumberFormatException) {
        println(errorMessage.format(userInput))
        return result
    }

    return result
}


fun getPositiveInt(zeroAuthorized: Boolean = false): Int {
    var result = -1

    try {
        result = readln().toInt()
    } catch (e: NumberFormatException) {
        return result
    }

    return result
}


fun getRandomCode(codeLength: Int, nbChars: Int = 10): String {
    var result = ""

    result += ALPHABET[Random().nextInt(1, nbChars)] // First digit cannot be 0

    repeat(codeLength - 1)  {
        var digit : Char
        do {
            digit = getRandomDigit(nbChars)
        } while (result.contains(digit))
        result += digit
    }

    return result
}


fun getRandomDigit(span: Int): Char {
    return ALPHABET[Random().nextInt(span)]
}


fun playTurn(solution: String) {
    println(INIT_GAME)
    val codeLength = solution.length
    var nbTurns = 1
    do {
        println("Turn ${nbTurns++}:")
        val userNumber = readln()
        val bullsCows = assessNumber(userNumber, solution)
        println(RESULT.format(formatResult(bullsCows)))
    } while (bullsCows[0] != codeLength)
}