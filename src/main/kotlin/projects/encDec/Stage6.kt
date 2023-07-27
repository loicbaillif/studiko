package projects.encDec

/**
 * Stage 6/6 : Choice, choice
 * https://hyperskill.org/projects/279/stages/1420/implement
 * @author JetBrains Academy
 * Solution by Loïc Baillif
 */

fun stage6(args: Array<String>) {
    println(setLaunchArgs6(args).joinToString("\n\t. ")) // DEBUG
    println(decodeShift("D rvio oj wmzvf amzz!", 21)) // DEBUG

    // Variables
    val userArgs = setLaunchArgs6(args)  // [mode, key, data, in, out, alg]

    // Exit if erroneous arguments
    if (userArgs.equals(arrayOf("false"))) return
}