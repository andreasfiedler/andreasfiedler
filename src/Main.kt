fun main() {
            // Einführung
    println("\u001b[34m Black World ist eine düstere Gegend wo nie ein normaler Mensch 4041 sich hin traut würde. Den hinter Ebene " +
            "von Down Town fängt die Bergwelt an wo die Orgz und Goblins herrschen. Selbst die Zwerge vermeiden nach " +
            "Black World zu gehen. Die Black Orgz, sind kräftiger wie ein Panzer, so sagt man. Von dort ist noch keiner " +
            "zurückgekehrt, der je etwas berichten könnte. Doch im im Märzen 4041 ist die Tochter des Chefs vom Clan " +
            "der Black Marins von Goblins entführt wurden. Die Black Marins sind Spezialisten auf die Verteidigung " +
            "ausgebildet, um gegen Orgz und Goblins zu kämpfen. Sie sind mit einer besonderen Ausrüstung unterwegs, " +
            "diese hat vielerlei Vorzüge zum Schutz und bei starken Angriffen. Boss in Black World gibt es den " +
            "mächtigsten Orgz aller Zeiten, so berichtet die Chronik. Dieser beherrscht diesen Teil der Welt. Aber " +
            "jetzt ist er zu weit gegangen. Er lies die Tochter des Clan Chefs entführen. Das ist der Punkt wo die " +
            "Truppe losziehen muss. Nur drei haben sich bereit erklärt die Tochter des Chefs zurück zu hohlen. Es ist " +
            "der Magier Frabo, der Drache Dogahn und der Magische Schmied Movin. Sie sind nicht die Besten aus dem Dorf " +
            "aber sie haben keine Angst vor den Zwergen und anderen Gestalten der Berge und auch von Black World nicht. " +
            "Der Magische Schmied ist ein Zwerg er kennt die Geheimen Wege durch die Berge. Der Drache kann fliegen " +
            "und den Überblick verschaffen ist er ist in Black World geboren und wurde von Frabo aufgezogen. Movin hat " +
            "Dogahn ein Reitrüstung gebaut, wo Frabo mit reisen konnte und Dogahn geschützt ist vor Angriffen. Diese " +
            "drei begeben sich auf dem Weg um die Tochter des Chefs zu finden und nach Hause zubringen. Der Magische " +
            "Schmied mit seinem Motorrad Redfuhl was so eineige Geheimnisse verbirgt. Frabo hebt mit dem Drachen Dogahn " +
            "ab und bildet die Vorhut aus der Luft, so können Sie die nicht so leicht aufgespührt. Sie bewegen sich auf " +
            "den einzigen Weg nach Kleinau, Kleinau ist ein Zwergendorf in den Bergen.\u001b[0m")

    // Heldenliste
    val helden = listOf(
        Held("Frabo", 75),
        Held("Dogahn", 90),
        Held("Movin", 75),
        Held("Redfuhl",35)
    )
    // Zugriff über Klasse Gegner
    var gegner = Gegner()
    var runde = 0 // Runden - Umlauf für die Heilung aller drei Runden

    // Momentan ohne zugriff auf die Einzelnen Heldeklassen
    // Aufruf der Helden mit Auswahl über readLine(), ab hier ist Kampfzone.
    while (gegner.gesundheit > 0 && helden.any { it.gesundheit > 0 }) {
        println("\u001b[93mWähle einen Helden aus (1-4):\u001b[0m")
        val auswahl = readln()?.toIntOrNull()
        if (auswahl in 1..4) {
            val held = helden[auswahl - 1]
            if (held.gesundheit <= 0) {
                println("\u001b[31m${held.name} ist bereits besiegt.\u001b[0m")
                continue
            }

            if (runde % 3 == 0 && held is Frabo) {
                println("Möchten Sie heilen? (j/n)")
                val heilen = readLine()
                if (heilen == "j") {
                    println("Möchten Sie alle Helden heilen? (j/n)")
                    val alleHeilen = readLine()
                    if (alleHeilen == "j") {
                        held.heileAlle(helden)
                    } else {
                        held.heilen(held)
                    }
                    continue
                }
            }

            val damage = held.attack()
            println("${held.name} greift an und verursacht $damage Schaden!")
            gegner.verteidigen(damage)

            if (gegner.gesundheit > 0) {
                println("Orgz greift an und verursacht $damage Schaden!")
                val gegnerDamage = gegner.attack()
                held.verteidigen(gegnerDamage)

                if (!gegner.helferEingesetzt) {
                    val helferDamage = gegner.rufeHelfer()
                    held.verteidigen(helferDamage)
                }
            }
        } else {
            println("\u001b[35mUngültige Auswahl.\u001B[0m")
        }

        runde++
    }

    if (gegner.gesundheit <= 0) {
        println("\u001b[34mDie Helden haben gewonnen!\u001b[0m")
    } else {
        println("\u001b[33mOrgz hat gewonnen!\u001b[0m")
    }
}