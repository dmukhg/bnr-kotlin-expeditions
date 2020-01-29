fun main(args: Array<String>) {
    val playerName = "Magdrigal"
    var playerHealth = 89
    val isBlessed = true
    val isImmortal = false

    // Compute Aura
    val auraVisible = isBlessed && playerHealth > 50 || isImmortal
    val auraColor = if (auraVisible) "GREEN" else "NONE"

    println("Aura color: $auraColor, isBlessed: ${ if (isBlessed) "Yes" else "No" }")

    val healthStatus = when (playerHealth) {
        100 -> "is in excellent condition!"
        in 90..99 -> "has a few scratches"
        in 75..89 -> if (isBlessed) {
            "has some minor wounds, but is healing quickly"
        } else {
            "has some minor wounds"
        }
        in 15..74 -> "looks pretty hurt"
        else -> "is in awful condition"
    }


    println("$playerName $healthStatus")
}