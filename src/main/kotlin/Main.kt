fun  main(){
    val magicalPowers = mapOf(
            "wet" to "healing",
            "dry" to "strength"
    )
    val fruits = mapOf(
            "wet" to "fruitwithonebud",
            "dry" to "fruitwithtwobuds"
    )
    val baobab = Baobab(magicalPowers, fruits, "wet")
    println(baobab.predictFruit()) // Output: The fruit to be born in the next season is banana with strength power.
    println(baobab.consumeFruit("mango")) // Output: You consumed mango and gained healing power.
}
class Baobab( val magicalPowers: Map<String, String>, val fruits: Map<String, String>, val season: String) {
    fun predictFruit(): String {
        val nextSeason = getNextSeason(season)
        val predictedFruit = fruits[nextSeason]
        val predictedPower = magicalPowers[nextSeason]
        return if (predictedFruit != null && predictedPower != null) {
            "The fruit to be born in the next season is $predictedFruit with $predictedPower power."
        } else {
            "The fruit to be born in the next season is unknown."
        }
    }
    fun consumeFruit(fruitName: String): String {
        val consumedPower = magicalPowers[fruitName]
        return if (consumedPower != null) {
            "You consumed $fruitName and gained $consumedPower power."
        } else {
            "The fruit you consumed is unknown or not available."
        }
    }
    fun getNextSeason(currentSeason: String): String {
        return if (currentSeason.toLowerCase() == "wet") {
            "dry"
        } else {
            "wet"
        }
    }
}








