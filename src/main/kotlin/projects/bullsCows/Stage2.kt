package projects.bullsCows

/**
 * Stage 2/7 : Grader
 * https://hyperskill.org/projects/364/stages/2156/implement
 * @author JetBrains Academy
 * Solution by Loïc Baillif
 */

fun stage2() {
    val secretCode = "3610";
    val assessment = assessNumber(readln(), secretCode)
    println(RESULT.format(formatResult(assessment), secretCode))
}