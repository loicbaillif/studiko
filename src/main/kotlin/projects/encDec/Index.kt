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
    stage5(arrayOf("-data", "I want to break free", "-key", "5", "-mode", "enc", "-in", "test.txt"))

    println("\n\n********** END OF PROJECT **********")
}