package ctrlflow.func.namedArgs

/**
 * Exercise: Car price
 * https://hyperskill.org/learn/step/4719
 * @author JetBrains Academy
 * Solution by Loïc Baillif
 */

const val INIT_PRICE = 20000

const val AGE_SHIFT = 2000 // 2000$ less per xxx years
const val GEARBOX_SHIFT = 1500 // 1500$ more if automatic gearbox
const val MILEAGE_SHIFT = 200 // 200$ less per xxx kilometers passed
const val SPEED_SHIFT = 100 // 100$ less per xxx km/h below yyy, and 100€ more if above

const val DEFAULT_AGE = 5
const val DEFAULT_GEARBOX = false
const val DEFAULT_MILEAGE = 100000
const val DEFAULT_SPEED = 120


fun exercise3() {
    println("*** Exercise: Car price ***")



    println("\n*** End of exercise ***")
}


fun carPrice(
    old: Int = DEFAULT_AGE,
    kilometers: Int = DEFAULT_MILEAGE,
    maximumSpeed: Int = DEFAULT_SPEED,
    automatic: Boolean = DEFAULT_GEARBOX
): Unit {
    var result = INIT_PRICE
    result -= old * AGE_SHIFT
    result -= kilometers / 10000 * MILEAGE_SHIFT
}