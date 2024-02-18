package projects.unitConverter

class dimension(userInput: Array<String>) {
    val sourceUnit = userInput[1]
    val sourceFigure: Double = userInput[0].toDouble()
    val sourceFigureString = userInput[0]
    var sourceIndex = 0
    var sourceType = "???"
    var sourceDimensionPlural = ""
    var sourceDimensionShort = ""
    var sourceDimensionSingular = ""
    val targetUnit = userInput[3]
    var targetIndex = 0
    var targetType = "???"
    var targetDimensionPlural = ""
    var targetDimensionShort = ""
    var targetDimensionSingular = ""
    val distancesList = arrayOf(distM, distCm, distFt, distIn, distKm, distMi, distMm, distYd)
    val weightsList = arrayOf(weightKg, weightG, weightLb, weightMg, weightOz)
    val unitsList = arrayOf(distancesList, weightsList)
    val distancesCoeff = arrayOf(M_PER_M, M_PER_CM, M_PER_FT, M_PER_IN, M_PER_KM, M_PER_MI, M_PER_MM, M_PER_YD)
    val weightsCoeff = arrayOf(KG_PER_KG, KG_PER_G, KG_PER_LB, KG_PER_MG, KG_PER_OZ)
    val coeffList = arrayOf(distancesCoeff, weightsCoeff)
    val unitsTypes = arrayOf("distance", "weight")
    var typeCounter = 0
    var index = 0

    init {
        for (unit in unitsList) {
            for (elt in unit) {
                if (elt.indexOf(sourceUnit) != -1) {
                    sourceDimensionShort = elt[0]
                    sourceIndex = index
                    sourceType = unitsTypes[typeCounter]
                }

                if (elt.indexOf(targetUnit) != -1) {
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

        if(validUnits() && compatibleUnits()) convertMeasure()

    }


    fun compatibleUnits(): Boolean {
        if (this.sourceType != this.targetType) {
            println(UNIT_INVALID.format(
                getUnitPlural(sourceType, sourceIndex),
                getUnitPlural(targetType, targetIndex)
            ))
            return false
        }
        return true
    }


    fun convertMeasure() {
        // 1. Convert to unit standard (kg or m)
        val intermediateMeasure = sourceFigure * getCoeffArray(targetType)[sourceIndex]

        val targetMeasure = intermediateMeasure / getCoeffArray(targetType)[targetIndex]


        println(OUTPUT_GENERIC.format(
            sourceFigureString,
            getUnitForm(sourceType, sourceIndex, sourceFigure),
            targetMeasure,
            getUnitForm(targetType, targetIndex, targetMeasure)
        ))
    }


    fun getCoeffArray(unitType: String) = coeffList[unitsTypes.indexOf(unitType)]

    fun getUnitArray(unitType: String) = unitsList[unitsTypes.indexOf(unitType)]

    fun getUnitForm(unitType: String, unitIndex: Int, quantity: Double): String {
        if (quantity == 1.0) {
            return getUnitSingular(unitType, unitIndex)
        } else {
            return getUnitPlural(unitType, unitIndex)
        }
    }

    fun getUnitPlural(unitType: String, unitIndex: Int): String = getUnitArray(unitType)[unitIndex][2]

    fun getUnitSingular(unitType: String, unitIndex: Int): String = getUnitArray(unitType)[unitIndex][1]

    fun validUnits(): Boolean {
        if (sourceType == "???" || targetType == "???") {
            println(UNIT_INVALID.format(
                if (sourceType == "???") sourceType else getUnitArray(sourceType)[sourceIndex][2],
                if (targetType == "???") targetType else getUnitArray(targetType)[targetIndex][2]
            ))
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