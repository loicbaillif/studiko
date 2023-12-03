package oop.basics.propAccess

/**
 * Exercise: Weather comparison
 * https://hyperskill.org/learn/step/7369
 * @author JetBrains Academy
 * Solution by Loïc Baillif
 */

const val AVERAGE_DUBAI = 30
const val AVERAGE_HANOI = 20
const val AVERAGE_MOSCOW = 5


class City(val name: String) {
    val cities = listOf("Dubai", "Moscow", "Hanoi")
    val averageTemps = listOf(AVERAGE_DUBAI, AVERAGE_MOSCOW, AVERAGE_HANOI)
    var degrees: Int = 0
        set(value) {
            if (value < -92 || value > 57) {
                field = averageTemps[cities.indexOf(name)]
            } else {
                field = value
            }
        }
}

fun exercise2() {
    println("*** Exercise: Weather comparison ***")

    val first = 66
    val second = 43
    val third = -10
    val firstCity = City("Dubai")
    firstCity.degrees = first
    val secondCity = City("Moscow")
    secondCity.degrees = second
    val thirdCity = City("Hanoi")
    thirdCity.degrees = third
    println(firstCity.degrees)

    println("\n*** End of exercise ***")
}


fun giveMinTemp(city1: City, city2: City, city3: City): String {
    var min = minOf(city1.degrees, city2.degrees, city3.degrees)
    val listTemp = listOf(city1.degrees, city2.degrees, city3.degrees)

    return if (listTemp.indexOf(min) == listTemp.lastIndexOf(min)) min.toString() else "neither"
}