package projects.unitConverter

class dimension(userInput: Array<String>) {
    val sourceUnit = userInput[1]
    val sourceFigure: Double = userInput[0].toDouble()
    val sourceFigureString = userInput[0]
    var sourceIndex = 0
    var sourceType = "???"
    var sourceDimensionShort = ""
    val targetUnit = userInput[3]
    var targetIndex = 0
    var targetType = "???"
    var targetDimensionShort = ""
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

        // 2. convert from unit standard to requested target
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
        return if (quantity == 1.0) {
            getUnitSingular(unitType, unitIndex)
        } else {
            getUnitPlural(unitType, unitIndex)
        }
    }

    fun getUnitPlural(unitType: String, unitIndex: Int): String = getUnitArray(unitType)[unitIndex][2]

    fun getUnitSingular(unitType: String, unitIndex: Int): String = getUnitArray(unitType)[unitIndex][1]

    fun validUnits(): Boolean {
        if (sourceType == "???" || targetType == "???") {
            println(UNIT_INVALID.format(
                if (sourceType == "???") sourceType else getUnitPlural(sourceType, sourceIndex),
                if (targetType == "???") targetType else getUnitPlural(targetType, targetIndex)
            ))
            return false
        }
        return true
    }
}