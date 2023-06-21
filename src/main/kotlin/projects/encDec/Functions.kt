package projects.encDec


fun cipherStage1(input: String) {
    for (ch in input) {
        if (ch !in 'a'..'z') continue
        print('z'.code - (ch.code - 'a'.code))
    }
    println()
}