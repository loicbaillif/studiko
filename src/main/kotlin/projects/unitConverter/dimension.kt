package projects.unitConverter

class dimension(userInput: Array<String>) {
    var sourceDimension = userInput[1];
    var dimensionPlural = "";
    var dimensionShort = "";
    var dimensionSingular = "";
    val distancesList = arrayOf(distCm, distFt, distIn, distKm, distM, distMi, distMm, distYd)
    val weightList = arrayOf(weightG, weightKg, weightLb, weightMg, weightOz)
}