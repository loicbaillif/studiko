package projects.bullsCows

fun assessNumber(userNumber: String, solution: String): List<Int> {
    var bulls = 0
    var cows = 0

    repeat(4) {
        if (userNumber[it] == solution[it]) {
            bulls++
        } else if (solution.contains(userNumber[it])) cows++
    }

    return listOf(bulls, cows)
}