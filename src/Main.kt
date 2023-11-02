

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
        Frabo("Frabo", 75),
        Held("Dogahn", 90),
        Movin("Movin", 75),
        Held("Redfuhl",35)
    )

    // Zugriff über Klasse Gegner
    var gegner = Gegner()

    // Runden - Umlauf für die Heilung aller drei Runden
    var runde = 0


    // Momentan ohne zugriff auf die Einzelnen Heldeklassen
    // Aufruf der Helden mit Auswahl über readLine(), ab hier ist Kampfzone.
    while (gegner.gesundheit > 0 && helden.any { it.gesundheit > 0 }) { // Gesundheit wird geprüft
        println("\u001b[93mWähle einen Helden aus (1-4):\u001b[0m") // Helden auswählen
        val auswahl = readln()?.toIntOrNull()
        if (auswahl in 1..4) {
            val held = helden[auswahl?.minus(1)!!]
            if (held.gesundheit <= 0) {  // Vorhandene Gesundheit wird geprüft
                println("\u001b[31m${held.name} ist bereits besiegt.\u001b[0m") // Wenn Held keine Gesundheit mehr hat
                                                                                // wird über continue eine neue Auswahl aufgerufen
                continue
            }
                // Wird nur aufgerufen, wenn 1 = Frabo ausgewählt wurde. Diese Verzweigung dient zum Heilen aller Helden.
            if (runde % 3 == 0 && held is Frabo) {
                // Abfragen Beginn zum Heilen
                println("Möchten Sie heilen? (j/n)")
               val heilen = readln()
                if (heilen == "j") {
                    // Hier ist die Abfrage für alle Helden
                    println("Möchten Sie alle Helden heilen? (j/n)") // Bei Eingabe 'n' wird nur der Zauberer geheilt
                    val alleHeilen = readln()
                    if (alleHeilen == "j") {
                        held.heileAlle(helden)
                    } else {
                        held.heilen(held)
                    }
                    continue
                }

            }
            // Angriff des gewählten Helden
            val damage = held.attack()
            gegner.verteidigen(damage)

            if (held.gesundheit > 0) { // Gesundheitsabfrage held vor der gegner Attacke
                val gegnerDamage = gegner.attack()
                println("${gegner.name} greift an und verursacht ${gegnerDamage} Schaden!")

                held.verteidigen(gegnerDamage)
                // Wenn Gegner seisen Helfer gerufen hat
                if (!gegner.helferEingesetzt) {

                    val helferDamage = gegner.rufeHelfer()
                    println("Goblin greift an und verursacht ${helferDamage} Schaden!")
                    held.verteidigen(helferDamage)
                }
            }

        } else {
            println("\u001b[35mUngültige Auswahl.\u001B[0m") // Ungültige Eingabe = leer oder größer als 4
        }
        // Heilen wird nach einer Anzahl durchgeführt
        runde++
    }
        // Spielende wenn Helden oder die Gegner keine Gesundheit haben!
    if (gegner.gesundheit <= 0) {
        println("\u001b[34mDie Helden haben gewonnen!\u001b[0m")
    } else {
        println("\u001b[33mOrgz hat gewonnen!\u001b[0m")
    }
}