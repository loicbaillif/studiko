package projects.encDec


import java.io.File
import kotlin.NumberFormatException


const val INVALID_MODE = "Error: %s is not a valid mode; \"enc\" or \"dec\" only"
const val INVALID_KEY = "Error: %s is not a valid key; Integer number expected"
const val INVALID_INPUT_FILE = "Error: The file %s does not exist."
const val INVALID_OUTPUT_FILE = "Error: The filename %s is not valid, it has no extension"


fun checkArgsValid(args: Array<String>): Boolean {
    // Check arguments validity
    // args = arrayOf(mode, key, data, in, out)

    // 0) mode
    if (args[0] != "enc" && args[0] != "dec") {
        print(INVALID_MODE.format(args[0]))
        return false
    }

    // 1) key
    try {
        args[1].toInt()
    } catch (notNum: NumberFormatException) {
        println(INVALID_KEY.format(args[1]))
        return false
    }

    // 3) in
    val inputFileName = args[3]
    val inputFile = File(inputFileName)
    if (!inputFile.exists()) {
        println(INVALID_INPUT_FILE.format(args[3]))
        return false
    }


    // 4) out
    val outputFileName = args[4]
    if (outputFileName.indexOf('.') == -1) {
        println(INVALID_OUTPUT_FILE.format(args[4]))
        return false
    }


    return true
}


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


fun cleanArgs(args: Array<String>) {
    // This function will clean the arguments, based on following criterias:
    // Recall, the args are : mode, key, data, in, out
    //   1. If there is no -mode, the program should work in the enc mode;
    //   2. If there is no -key, the program should consider that key is 0;
    //   3. If there are both -data and -in arguments, your program should prefer -data over -in.

    // 1: Mode enc by default
    if (args[0] == "") args[0] = "enc"

    // 2: Key 0 by default
    if (args[1] == "") args[1] = "0"

    // 3: data has precedence over in
    if (args[2] != "") args[3] = ""
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


fun encode5(data: String, key: Int): String {
    // Variable
    val sbResult = StringBuilder()

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

    // Get user inputs
    val modeIndex = args.indexOf("-mode")
    val mode = if (modeIndex == -1) "enc" else args[modeIndex + 1]

    val keyIndex = args.indexOf("-key")
    val key = if (keyIndex == -1) "0" else args[keyIndex + 1]

    val dataIndex = args.indexOf("-data")
    val data = if (dataIndex == -1) "" else args[dataIndex + 1]

    val inIndex = args.indexOf("-in")
    val inData = if (inIndex == -1) "" else args[inIndex + 1]

    val outIndex = args.indexOf("-out")
    val outData = if (outIndex == -1) "" else args[outIndex + 1]

    val resultArray = arrayOf(mode, key, data, inData, outData)

    // Check validity
    if (!checkArgsValid(resultArray)) return arrayOf("false")

    // Clean arguments
    cleanArgs(resultArray)

    return resultArray

}


fun treatInput(args: Array<String>) {
    // Recall: args = ["mode", "key", "data", "in", "out"]

    // Variables
    val inputText = if (args[2] != "") args[2] else File(args[3]).readText()
    val key = args[1].toInt()

    println(inputText) // DEBUG
}