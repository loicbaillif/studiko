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
    // stage5(arrayOf("-data", "\\jqhtrj%yt%m~ujwxpnqq&", "-key", "5", "-mode", "dec", "-in", "data/textFile1.txt", "-out", "data/temp.txt"))
    stage6(arrayOf("-data", "Ping!", "-key", "15", "-mode", "enc", "-in", "data/textFile1.txt", "-alg", "unic"))


    println("\n\n********** END OF PROJECT **********")
}