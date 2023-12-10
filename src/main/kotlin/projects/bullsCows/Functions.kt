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


fun formatResult(bullsCows: List<Int>): String {
    if (bullsCows == listOf(0, 0)) return "None"
    if (bullsCows[0] == 0) return "${bullsCows[1]} cow(s)"
    if (bullsCows[1] == 0) return "${bullsCows[0]} bull(s)"
    return "${bullsCows[0]} bull(s) and ${bullsCows[1]} cow(s)"
}