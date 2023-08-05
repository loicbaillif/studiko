package projects.converter

fun tenToBin(input: Int): String {
    // Variable
    val sbResult = StringBuilder()
    var tempInput = input

    // Loop
    while (tempInput > 0) {
        sbResult.insert(0, (tempInput % 2).toString())
        tempInput /= 2
    }

    return sbResult.toString()
}