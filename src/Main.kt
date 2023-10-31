fun main() {
    // Heldenliste
    val helden = listOf(
        Held("Frabo", 75),
        Held("Dogahn", 100),
        Held("Movin", 75),
        Held("Redfuhl",35)
    )

    // Zugriff über Klasse Gegner
    var gegner = Gegner()

    // Momentan ohne zugriff auf die Einzelnen Heldeklassen
    // Aufruf der Helden mit Auswahl über readLine(), ab hier ist Kampfzone.
    while (gegner.gesundheit > 0 && helden.any { it.gesundheit > 0 }) {
        println("\u001b[93mWähle einen Helden aus (1-4):\u001b[0m")
        val auswahl = readln().toIntOrNull()
        if (auswahl in 1..4) {
            val held = helden[auswahl?.minus(1)!!] // Null ausschließen
            if (held.gesundheit <= 0) {
                println("\u001b[31m${held.name} ist bereits besiegt.\u001b[0m") // Ausgabe, wenn Held keine
                                                                                // Gesundheitspunkte mehr hat!
                continue
            }
            println("${held.name} greift an!")  // Gewählter Held greift an.
            for (i in 1..1) {
                val damage = held.attack()
                gegner.verteidigen(damage)
                if (gegner.gesundheit <= 0) break // Wenn Helden oder Gegner keine Gesundheitspunkte über haben wird das Spiel beendet
            }
            if (gegner.gesundheit > 0) { // Gesundheit und Angriff Gegner
                println("Orgz greift an!")
                val damage = gegner.attack()
                held.verteidigen(damage)
                // Helfer rufen
                if (!gegner.helferEingesetzt) {
                    val helferDamage = gegner.rufeHelfer()
                    held.verteidigen(helferDamage)
                }
            }
        } else {
            println("\u001b[35mUngültige Auswahl.\u001B[0m") // Wenn keine Eingabe erfolgt oder eine Zahl größer ist als 4
        }
    }

    if (gegner.gesundheit <= 0) {
        println("\u001b[34mDie Helden haben gewonnen!\u001b[0m") // Gewinnanzeige Held
    } else {
        println("\u001b[33mOrgz hat gewonnen!\u001b[0m") // Gewinnanzeige Gegner
    }
}