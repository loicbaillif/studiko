package projects.unitConverter

class dimension(userInput: Array<String>) {
    var sourceDimension = userInput[1];
    var dimensionPlural = "";
    var dimensionShort = "";
    var dimensionSingular = "";
    val distancesList = arrayOf(distCm, distFt, distIn, distKm, distM, distMi, distMm, distYd)
    val weightsList = arrayOf(weightG, weightKg, weightLb, weightMg, weightOz)

    init {
        for (elt in distancesList) {
            if (elt.indexOf(sourceDimension) != -1) {
                // unit is a distance
                dimensionPlural = elt[2]
                dimensionShort = elt[0]
                dimensionSingular = elt[1]
                break
            }
        }

        for (elt in weightsList) {
            if (elt.indexOf(sourceDimension) != -1) {
                // Unit is a weight
                dimensionPlural = elt[2]
                dimensionShort = elt[0]
                dimensionSingular = elt[1]
            }
        }
    }
}