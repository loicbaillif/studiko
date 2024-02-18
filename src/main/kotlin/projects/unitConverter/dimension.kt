package projects.unitConverter

class dimension(userInput: Array<String>) {
    val sourceDimension = userInput[1]
    val sourceFigure: Double = userInput[0].toDouble()
    var sourceIndex = 0
    var sourceType = "???"
    var sourceDimensionPlural = ""
    var sourceDimensionShort = ""
    var sourceDimensionSingular = ""
    val targetDimension = userInput[3]
    var targetIndex = 0
    var targetType = "???"
    var targetDimensionPlural = ""
    var targetDimensionShort = ""
    var targetDimensionSingular = ""
    val distancesList = arrayOf(distM, distCm, distFt, distIn, distKm, distMi, distMm, distYd)
    val weightsList = arrayOf(weightKg, weightG, weightLb, weightMg, weightOz)
    val unitsList = arrayOf(distancesList, weightsList)
    val unitsTypes = arrayOf("distance", "weight")
    var typeCounter = 0
    var index = 0

    init {
        for (unit in unitsList) {
            for (elt in unit) {
                if (elt.indexOf(sourceDimension) != -1) {
                    sourceDimensionShort = elt[0]
                    sourceIndex = index
                    sourceType = unitsTypes[typeCounter]
                }

                if (elt.indexOf(targetDimension) != -1) {
                    targetDimensionShort = elt[0]
                    targetIndex = index
                    targetType = unitsTypes[typeCounter]
                }
                index++
            }
            if (sourceType != "???" && targetType != "???") break
            typeCounter++
            index = 0
        }

    if(validUnits()) {
        println("Something to do")
    }

    }


    fun getUnitArray(unitType: String) = unitsList[unitsTypes.indexOf(unitType)]

    fun validUnits(): Boolean {
        if (sourceType == "???" || targetType == "???") {
            println(UNIT_INVALID.format(
                if (sourceType == "???") sourceType else getUnitArray(sourceType)[sourceIndex][2],
                if (targetType == "???") targetType else getUnitArray(targetType)[targetIndex][2])
                )
            return false
        }
        return true
    }

    fun introduce() {
        // DEBUG
        println("\t. User provided $sourceFigure $sourceDimensionShort, which is a $sourceType")
        println("\t. User would like it to be converted to $targetDimensionShort, which is $targetType")
        println("\t. Source index = $sourceIndex\n\t. Target index = $targetIndex")
    }
}