package projects.encDec

/**
 * Encryption-Decryption
 */

fun index() {
    println("********** PROJECT : ENCRYPTION-DECRYPTION **********\n")

    // stage1()
    // stage2()
    // stage3()
    // stage4(arrayOf("-data", "I want to break free", "-key", "5"))
    stage5(arrayOf("-data", "Welcome to hyperskill!", "-key", "5", "-mode", "enc", "-in", "data/textFile1.txt", "-out", "data/temp.txt"))

    println("\n\n********** END OF PROJECT **********")
}