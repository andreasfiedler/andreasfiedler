import Enums.Schwierigkeit
import java.util.*


fun main() {
    // Farbauswahl
    val red = "\u001B[31m"
    val green = "\u001B[32m"
    val yellow = "\u001B[33m"
    val blue = "\u001B[34m"
    val magenta = "\u001B[35m"
    val cyan = "\u001B[36m"
    val bold = "\u001B[1m"
    val underline = "\u001B[4m"
    val backgroundYellow = "\u001B[43m"
    // Farbe zurücksetzten
    val reset = "\u001B[0m"

    // Einführung
    println(
        "${blue}  Black World ist eine düstere Gegend wo nie ein normaler Mensch 4041 sich hin traut würde. Den hinter Ebene " +
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
                "den einzigen Weg nach Kleinau, Kleinau ist ein Zwergendorf in den Bergen.\n ${underline}${cyan}Wir starten jetzt in 5 Sekunden! ${reset}"
    )


    // Start Timer
    val timer = Timer()
    var seconds = 5 // Die Anzahl der Sekunden für den Countdown

    timer.scheduleAtFixedRate(object : TimerTask() {
        override fun run() {
            if (seconds < 1) {
                timer.cancel()
                println("${bold} Bitte wählen Sie eine Schwierigkeitsstufe (Leicht, Mittel, Schwer):${reset}")

            } else {
                println("$seconds")
                seconds--
            }
        }
    }, 0, 1000)



    // Eingabe Schwiergikeitsstufe
    val input = readln()
    var selectedDifficulty = Schwierigkeit.MITTEL
     if (input == "Leicht") {
         selectedDifficulty = Schwierigkeit.LEICHT
     } else if (input == "Mittel") {
         selectedDifficulty = Schwierigkeit.MITTEL
     } else if (input == "Schwer") {
         selectedDifficulty = Schwierigkeit.SCHWER
     }


    println("Du hast die Schwierigkeitsstufe ${selectedDifficulty.getDescription()} ausgewählt.")
    val multiplier = selectedDifficulty.getDifficultyMultiplier()
    println("Der Schwierigkeitsmultiplikator beträgt $multiplier")
    //var schwierigkeit: Schwierigkeit = schwierigkeitFromIndex(readln().toInt())
    //println("Sie haben die Schwierigkeit $schwierigkeit gewählt.")

    // Heldenliste
    val helden = listOf(
        Frabo("Frabo", 75),
        Held("Dogahn", 85),
        Movin("Movin", 40),
        Held("Redfuhl", 35)
    )

// Zugriff über Klasse Gegner
    var gegner = Gegner()

// Runden - Umlauf für die Heilung aller drei Runden
    var runde = 0



    // Hier beginnt der Kampf

    while (gegner.gesundheit > 0 && helden.all { it.gesundheit > 0 }) {
        println("\u001b[93mWähle einen Helden aus (1-4):\u001b[0m")

        val auswahl = readln()?.toIntOrNull()

        if (auswahl in 1..4) {
            val held = helden[auswahl?.minus(1)!!]

            if (held.gesundheit <= 0) {
                println("\u001b[31m${held.name} ist bereits besiegt.\u001b[0m")
                continue
            }

            // Anwenden der Verstärkung
            if (runde % 4 == 0 && held is Held) {
                val verstaerkung = held.beutel.verstaerkung(2)
                println("${held.name} hat eine Verstärkung von $verstaerkung erhalten.")
            }
                // Hier beginnt die Heilung aus dem eigenen Beutel3
            if (runde % 3 == 0 && held is Frabo) {
                println("Möchten Sie heilen? (j/n)")  // Abfrage zur Heilung
                val heilen = readln()

                if (heilen == "j") {
                    // Alle Helden Heilen
                    println("Möchten Sie alle Helden heilen? (j/n)")
                    val alleHeilen = readln()
                    // Alle werden geheilt, außer bei Eingabe 'n' wird nur Der Frabo geheilt Ausgabe in Zeile
                    if (alleHeilen == "j") {
                        held.heileAlle(helden)
                    } else {
                        held.heilen(held)
                    }

                    continue
                }
            }

            val damage = held.attack()
            gegner.verteidigen(damage)

            if (held.gesundheit > 0) {
                val gegnerDamage = gegner.attack()
                println("${gegner.name} greift an und verursacht ${gegnerDamage} Schaden!")
                held.verteidigen(gegnerDamage)

                if (!gegner.helferEingesetzt) {
                    val helferDamage = gegner.rufeHelfer()
                    println("Goblin greift an und verursacht ${helferDamage} Schaden!")
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