package projects.cinema

/**
 * Stage 1/5: Arrangement
 * https://hyperskill.org/projects/138/stages/735/implement
 * @author JetBrains Academy
 * Solution by Loïc Baillif
 */

fun stage1() {
    val nbRows = 7
    val nbSeats = 8

    for (i in 0..nbRows) {

        for (j in 0..nbSeats) {
            print(if (j == 0) "$i " else "S ")
        }

    }
}