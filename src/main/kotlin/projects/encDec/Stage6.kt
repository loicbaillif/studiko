package projects.encDec

/**
 * Stage 6/6 : Choice, choice
 * https://hyperskill.org/projects/279/stages/1420/implement
 * @author JetBrains Academy
 * Solution by Loïc Baillif
 */

fun stage6(args: Array<String>) {
    // Variables
    val userArgs = setLaunchArgs6(args)  // [mode, key, data, in, out, alg]

    // Exit if erroneous arguments
    if (userArgs.contentEquals(arrayOf("false"))) return

    // Treat arguments if valid
    treatInput6(userArgs)
}