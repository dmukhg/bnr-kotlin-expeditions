fun main(args: Array<String>) {
    val playerName = "Magdrigal"
    var playerHealth = 89
    val isBlessed = true
    val isImmortal = false

    val auraColor = auraColor(isBlessed, playerHealth, isImmortal)
    val healthStatus = formatHealthStatus(playerHealth, isBlessed)
    val inebriationStatus = castFireball(2)

    printHealthStatus(auraColor, isBlessed, playerName, healthStatus)
    printInebriationStatus(inebriationStatus)
}

fun printInebriationStatus(inebriationStatus: Int): Unit {
    val status = when(inebriationStatus) {
        in 1..10 -> "tipsy"
        in 11..20 -> "sloshed"
        in 21..30 -> "soused"
        in 31..40 -> "stewed"
        else -> "..t0aSt3d"
    }

    print("Inebriation Status: $status")
}

private fun printHealthStatus(auraColor: String, isBlessed: Boolean, playerName: String, healthStatus: String) {
    println("Aura color: $auraColor, isBlessed: ${if (isBlessed) "Yes" else "No"}")
    println("$playerName $healthStatus")
}

private fun auraColor(isBlessed: Boolean, playerHealth: Int, isImmortal: Boolean) = if (isBlessed && playerHealth > 50 || isImmortal) "GREEN" else "NONE"

private fun formatHealthStatus(playerHealth: Int, isBlessed: Boolean): String {
    return when (playerHealth) {
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
}

private fun castFireball(numTimes: Int = 2): Int {
    println("A fireball was cast into existence. (x$numTimes)")
    return minOf(numTimes * 10, 50)
}