val RED = "\u001B[31m"
fun main() {

    // Einleitung
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



    // Hier folgen die Angriffe der Helden und es wird mit Würfeln ermittelt und dann erfolgt die Ermittlung der
    // zufälligen Stärke

    /** val gesundheit = GegnerBlack("Orgz", 35, 15, 200 )

    // Magier Frabo hat drei zauber
    println("Frabo greift an!")
    val zauberer = Zauberer()
    zauberer.zaubern()
    gesundheit.verletzungBewerten(zauberer.zaubern())

    // Drache Dogahn hat drei Attacken
    println("Dogahn greift an")
    val drache = Drache()
    println("Orgz verliert durch den Angriff")
    gesundheit.verletzungBewerten(drache.angreifen())

    // Magischerschmied Movin
    println("Movin greift an")
    val magischerSchmied = MagischerSchmied()
    magischerSchmied.schmied()
    gesundheit.verletzungBewerten(magischerSchmied.schmied())
    // Zusatz Attacke Motorrad
    println("Zusatz Attacke Motorrad")
    magischerSchmied.redfuhl()
    gesundheit.verletzungBewerten(magischerSchmied.redfuhl())*/
    val helden = listOf(Held("Frabo", 75), Held("Dogahn", 100), Held("Movin", 75), Held("redfuhl",35))
    val gegner = Gegner("Orgz")

    while (gegner.gesundheit > 0 && helden.any { it.gesundheit > 0 }) {
        println("Wähle einen Helden aus (1-4):")
        val auswahl = readln()?.toIntOrNull()
        if (auswahl in 1..4) {
            val held = helden[auswahl?.minus(1)!!]
            if (held.gesundheit <= 0) {
                println("\u001b[31m${held.name} ist bereits besiegt.\u001b[0m")
                continue
            }
            println("${held.name} greift an!")
            for (i in 1..1) {
                val damage = held.attack()
                gegner.verteidigen(damage)
                if (gegner.gesundheit <= 0) break
            }
            if (gegner.gesundheit > 0) {
                println("Orgz greift an!")
                val damage = gegner.attack()
                held.verteidigen(damage)

                val helferDamage = gegner.rufeHelfer()
                held.verteidigen(helferDamage)
            }
        } else {
            println("Ungültige Auswahl.")
        }
    }

    if (gegner.gesundheit <= 0) {
        println("\u001b[34mDie Helden haben gewonnen!\u001b[0m")
    } else {
        println("\u001b[33mOrgz hat gewonnen!\u001b[0m")
    }

}

