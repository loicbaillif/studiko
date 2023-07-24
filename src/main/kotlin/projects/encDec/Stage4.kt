package projects.encDec

/**
 * Stage 4/6 : I command you
 * https://hyperskill.org/projects/279/stages/1418/implement
 * @author JetBrains Academy
 * Solution by LoïC Baillif
 */

fun stage4(args: Array<String>) {
    // Variables
    val userArgs = setLaunchArgs(args) // [mode, key, data]

    if (userArgs[0] == "enc") encode4(userArgs[2], userArgs[1]) else decode4(userArgs[2], userArgs[1])
}