fun main(args: Array<String>) {
    val playerName = "Magdrigal"
    var playerHealth = 89
    val isBlessed = true
    val isImmortal = false

    // Compute Aura
    val auraVisible = isBlessed && playerHealth > 50 || isImmortal
    if (auraVisible) {
        println("GREEN")
    } else {
        println("NONE")
    }

    val healthStatus = if (playerHealth == 100) {
        "is in excellent health"
    } else if (playerHealth >= 90) {
        "has a few scratches"
    } else if (playerHealth >= 75) {
        if (isBlessed) {
            "has some minor wounds, but is healing quickly."
        } else {
            "has some minor wounds"
        }
    } else if (playerHealth >= 15) {
        "looks pretty hurt"
    } else {
        "is in awful condition"
    }

    print(playerName + " " + healthStatus)
}