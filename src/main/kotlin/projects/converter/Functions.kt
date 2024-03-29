package projects.converter

import java.lang.Exception
import java.math.BigDecimal
import java.math.BigInteger

fun elseToTen(input: String, radix: Int): BigInteger {
    if (radix == 10) return input.toBigInteger()

    var result: BigInteger = BigInteger.ZERO
    for (c in input) {
        val digit = c.digitToInt(radix)
        result = result * radix.toBigInteger() + digit.toBigInteger()
    }

    return result
}


fun elseToTenDecimal(input: String, radix: Int): BigDecimal {
    if (radix == 10) return input.toBigDecimal()

    var result: BigDecimal = BigDecimal.ZERO.setScale(5)
    val radixBigDec = radix.toBigDecimal()

    for (i in input.lastIndex downTo 2) {
        result += input[i].digitToInt(radix).toBigDecimal()
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
    return if (sbResult.isEmpty()) "0" else sbResult.toString()
}


fun tenToElseDecimal(input: BigDecimal, radix: Int): String {
    // Variables
    val sbResult = StringBuilder()
    var tempInput = input
    var digit: Int

    repeat(5) {
        val tempVal = tempInput * radix.toBigDecimal()
        digit = (tempVal / BigDecimal.ONE).toInt()
        sbResult.append(if (digit > 9) giveHexCode(digit) else digit)
        tempInput = tempVal - digit.toBigDecimal()
    }

    return sbResult.toString()
}


fun oneToOther(userInput: String, sourceBase: Int, targetBase: Int): String {
    // Variables
    val decimalPosition = userInput.indexOf(".")
    val isDecimal = decimalPosition != -1
    val userInputInt = userInput.substringBefore('.')
    val userInputDec = if (isDecimal) "0.${userInput.substringAfter('.')}" else "0"

    // 1) Convert from source base to 10
    val userInputIntBase10 = elseToTen(userInputInt, sourceBase) // BigInteger
    val userInputDecBase10 = if (isDecimal) elseToTenDecimal(userInputDec, sourceBase) else BigDecimal.ZERO


    // 2) Convert from base 10 to target base
    val resultInt = tenToElse(userInputIntBase10, targetBase)
    val resultDec = tenToElseDecimal(userInputDecBase10, targetBase)


    // 3) Build result
    return "$resultInt${if (isDecimal) "." else ""}${if (isDecimal) resultDec else ""}"
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