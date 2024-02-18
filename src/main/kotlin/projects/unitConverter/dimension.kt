package projects.unitConverter

class dimension(userInput: Array<String>) {
    val sourceDimension = userInput[1];
    val sourceFigure: Double = userInput[0].toDouble();
    var sourceType = "";
    var dimensionPlural = "";
    var dimensionShort = "";
    var dimensionSingular = "";
    val distancesList = arrayOf(distM, distCm, distFt, distIn, distKm, distMi, distMm, distYd)
    val weightsList = arrayOf(weightKg, weightG, weightLb, weightMg, weightOz)
    val unitsList = arrayOf(distancesList, weightsList)
    val unitsTypes = arrayOf("distance", "weight")
    var typeCounter = 0

    init {
        for (unit in unitsList) {
            for (elt in unit) {
                if (elt.indexOf(sourceDimension) != -1) {
                    dimensionPlural = elt[2]
                    dimensionShort = elt[0]
                    dimensionSingular = elt[1]
                    sourceType = unitsTypes[typeCounter]
                    break
                }
            }
            if (sourceType != "") break
            typeCounter++
        }
    }

    fun introduce() {
        println("\t. user provided $sourceFigure $dimensionShort")
    }
}