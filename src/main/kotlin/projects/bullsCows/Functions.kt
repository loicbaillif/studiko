package projects.bullsCows

import java.lang.NumberFormatException

fun assessNumber(userNumber: String, solution: String): List<Int> {
    var bulls = 0
    var cows = 0

    repeat(4) {
        if (userNumber[it] == solution[it]) {
            bulls++
        } else if (solution.contains(userNumber[it])) cows++
    }

    return listOf(bulls, cows)
}


fun formatResult(bullsCows: List<Int>): String {
    if (bullsCows == listOf(0, 0)) return "None"
    if (bullsCows[0] == 0) return "${bullsCows[1]} cow(s)"
    if (bullsCows[1] == 0) return "${bullsCows[0]} bull(s)"
    return "${bullsCows[0]} bull(s) and ${bullsCows[1]} cow(s)"
}


fun getCode(codeLength: Int): String {
    var index = 0
    var nanoTime = getNanoTime()
    var result = ""
    while (result.length < codeLength) {
        if (result == "") {
            while (nanoTime[index] == '0') index++
        }
        if (result.contains(nanoTime[index])) index++ else result += nanoTime[index]

        index++
        if (index == nanoTime.length) {
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


fun getPasswordLength(): Int {
    var passwordSize = 4
    try {
        passwordSize = readln().toInt()
    } catch (notFigure: NumberFormatException) {
        println("This is not a number ... Length set to 4")
    }

    if (passwordSize > 10) {
        println(INVALID_PASSWORD_LENGTH.format(passwordSize))
        return 0
    }
    if (passwordSize < 1) {
        println(INVALID_LENGTH_NEGATIVE)
        return 0
    }

    return passwordSize
}