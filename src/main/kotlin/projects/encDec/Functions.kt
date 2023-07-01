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
    // Arguemnts and default value:
    //  -mode : enc
    //  -key : 0
    //  -data : "" (empty string)

    // Variables
    val modeIndex = args.indexOf("-mode")
    val mode = if (modeIndex == -1) "enc" else args[modeIndex + 1]
    println("Chosen mode = $mode")

    val keyIndex = args.indexOf("-key")
    val key = if (keyIndex == -1) 0 else args[keyIndex + 1].toInt()
    println("Chosen key = $key")

    return arrayOf(mode)

}