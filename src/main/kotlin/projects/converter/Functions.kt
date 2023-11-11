package projects.converter

import java.lang.Exception
import java.math.BigDecimal
import java.math.BigInteger

fun elseToTen(input: String, radix: Int): BigInteger {
    var result: BigInteger = BigInteger.ZERO
    for (c in input) {
        val digit = c.digitToInt(radix)
        result = result * radix.toBigInteger() + digit.toBigInteger()
    }

    return result
}


fun elseToTenDecimal(input: String, radix: Int): BigDecimal {
    var result: BigDecimal = BigDecimal.ZERO.setScale(5)
    val radixBigDec = radix.toBigDecimal()

    for (i in input.lastIndex downTo 2) {
        result += input[i].toString().toBigDecimal()
        result /= radixBigDec
    }

    return result
}


fun tenToElse(input: BigInteger, radix: Int): String {
    // Variables
    val sbResult = StringBuilder()
    var tempInput = input
    var digit: Int

    // Loop
    while (tempInput > BigInteger.ZERO) {
        digit = tempInput.remainder(radix.toBigInteger()).toInt()
        sbResult.insert(0, if (digit > 9) giveHexCode(digit) else digit)
        tempInput /= radix.toBigInteger()
    }

    // Result
    return sbResult.toString()
}


fun tenToElseDecimal(input: BigDecimal, radix: Int): String {
    // Variables
    val sbResult = StringBuilder()
    var tempInput = input
    var digit: Int

    while (tempInput > BigDecimal.ZERO) {
        val tempVal = tempInput * radix.toBigDecimal()
        digit = (tempVal / BigDecimal.ONE).toInt()
        sbResult.append(if (digit > 9) giveHexCode(digit) else digit)
        tempInput = tempVal - digit.toBigDecimal()
    }

    return sbResult.toString()
}


fun oneToOther(userInput: String, oneSource: Int, otherSource: Int): String {
    // Variables
    val decimalPosition = userInput.indexOf(".")
    val intPart = userInput.substringBefore('.')
    var decPart = "0."

    if (decimalPosition != -1) decPart += userInput.substringAfter('.')

    // Converts number from given base to base 10 ...
    val convertNumberInt = (if (oneSource != 10) elseToTen(intPart, oneSource) else intPart.toBigInteger())
    if (decimalPosition != -1) {
        // Decimal input case
        val convertNumberDec = (if (oneSource != 10) {
            elseToTenDecimal(decPart, oneSource)
        } else decPart.toBigDecimal())
    }

    if (otherSource != 10) {
        return tenToElse(convertNumber, otherSource)
    }

    return  convertNumber.toString()
}


fun giveHexCode(decNum: Int): Char {
    val alphabet = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ"
    return alphabet[decNum]
}


fun mainMenu() {
    var userMenu = ""
    while (userMenu != "/exit") {
        println(PROMPT_STAGE2)
        userMenu = readln()

        when (userMenu) {
            "/from" -> {
                println(INPUT_DECIMAL)
                val userInput = readln().toInt()
                println(TARGET_BASE)
                val radix = readln().toInt()
                println("$CONVERSION_RESULT ${tenToElse(userInput.toBigInteger(), radix)}")
            }
            "/to" -> {
                println(SOURCE_NUMBER_OTHER_BASE)
                val userInput = readln()
                println(SOURCE_OTHER_BASE)
                val sourceBase = readln().toInt()
                println("$CONVERSION_RESULT_TO_10 ${ elseToTen(userInput, sourceBase) }")
            }
            "/exit" -> continue
            else -> println("Not a valid option ...")
        }
    }
}


fun mainMenuSt3() {
    println(MAIN_STAGE3)
    var userMenu = readln()
    val baseList = intArrayOf(10, 2) // sourceBase, targetBase)


    while (userMenu != "/exit") {

        var userInt = ""

        try {
            repeat(2) { baseList[it] = userMenu.split(" ")[it].toInt() }
        } catch (e: Exception) {
            repeat(2) {baseList[it] = 10 }
        }

        while (userInt != "/back") {
            println(INPUT_STAGE3.format(baseList[0], baseList[1]))
            userInt = readln()

            if (userInt != "/back") {
                println(CONVERSION_RESULT + oneToOther(userInt, baseList[0], baseList[1]))
            }
        }

        println(MAIN_STAGE3)
        userMenu = readln()
    }
}


fun mainMenuSt4() {
    println(MAIN_STAGE3)

    var userMenu = readln()
    val baseList = intArrayOf(10, 2) // sourceBase, targetBase)


    while (userMenu != "/exit") {

        var userDec = ""

        try {
            repeat(2) { baseList[it] = userMenu.split(" ")[it].toInt() }
        } catch (e: Exception) {
            repeat(2) {baseList[it] = 10 }
        }

        while (userDec != "/back") {
            println(INPUT_STAGE3.format(baseList[0], baseList[1]))
            userDec = readln()

            if (userDec != "/back") {
                println(CONVERSION_RESULT + oneToOther(userDec, baseList[0], baseList[1]))
            }
        }

        println(MAIN_STAGE3)
        userMenu = readln()
    }
}