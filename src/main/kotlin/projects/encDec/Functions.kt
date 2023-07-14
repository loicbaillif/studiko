package projects.encDec

import java.lang.NumberFormatException


fun cipherStage1(input: String) {
    for (ch in input) {
        if (ch !in 'a'..'z') {
            print(ch)
            continue
        }
        print(('z'.code - (ch.code - 'a'.code)).toChar())
    }
    println()
}


fun decode3() {
    // decode function for stage 3
    // Variables
    val textToDecrypt = readln()
    val decryptionKey = try { readln().toInt() } catch (notNumber: NumberFormatException) { 0 }

    // Output loop
    for (ch in textToDecrypt)  print(ch - decryptionKey)
}


fun decode4(data: String, key: String) {
    // Variable
    val decKey = try { key.toInt() } catch (notNumber: NumberFormatException) { 0 }

    // Output loop
    for (ch in data) print(ch - decKey)
    println()
}


fun encodeWithKey(userInput: String, key: Int) {
    for (ch in userInput) {
        if (ch.lowercaseChar() !in ALPHABET) {
            print(ch)
            continue
        }
        val posInAlphabet = ch.lowercaseChar() - 'a'
        print(ALPHABET[(posInAlphabet + key) % ALPHABET.length])
    }
}


fun encode3() {
    // encode function for stage 3
    // Variables
    val textToEncrypt = readln()
    val encryptionKey = try { readln().toInt() } catch (notNumber: NumberFormatException) { 0 }

    // output loop
    for (ch in textToEncrypt) print(ch + encryptionKey)
}


fun encode4(data: String, key: String) {
    // Variable
    val encKey = try { key.toInt() } catch (notNumber: NumberFormatException) { 0 }

    // Output loop
    for (ch in data) print(ch + encKey)
    println()
}


fun menu() {
    // Get user choice, check its validity and apply action
    val userChoice = readln()
    when (userChoice) {
        "dec" -> decode3()
        "enc" -> encode3()
        else -> menu()
    }
}


fun setLaunchArgs(args: Array<String>): Array<String> {
    // Receives the argument provided at program execution, and returns
    // user values if provided, default value elsewhere
    // Arguments and default value:
    //  -mode : enc
    //  -key : 0
    //  -data : "" (empty string)
    // will return an array [mode, key, data]

    // Variables
    val modeIndex = args.indexOf("-mode")
    val mode = if (modeIndex == -1) "enc" else args[modeIndex + 1]

    val keyIndex = args.indexOf("-key")
    val key = if (keyIndex == -1) "0" else args[keyIndex + 1]

    val dataIndex = args.indexOf("-data")
    val data = if (dataIndex == -1) "" else args[dataIndex + 1]

    return arrayOf(mode, key, data)
}


fun setLaunchArgs5(args: Array<String>): Array<String> {
    // Receives the argument provided at program execution, and returns
    // user values if provided, default value elsewhere
    // Arguments and default value:
    //  -mode : enc   [enc, dec]
    //  -key : 0      [0...]
    //  -data : "" (empty string)
    //  -in : filename or String
    //  -out : filename or String
    // will return an array [mode, key, data]

    // Variables
    val resultArray = setLaunchArgs(args)

    val inIndex = args.indexOf("-in")
    val inData = if (inIndex == -1) "" else args[inIndex + 1]

    val outIndex = args.indexOf("-out")
    val outData = if (outIndex == -1) "" else args[outIndex + 1]

    return resultArray + arrayOf(inData, outData)

}