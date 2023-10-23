/*open class Attacke(val name: String, val stärke: Int) {
    fun trefferstärkeErmittelnMagie(): String {
        val wua = (1..6).random()
        val wus = (1..12).random()
        return "Die Würfelergebnis $wua ist $name hat eine Stärke von $wus"
    }

    fun trefferstärkeErmittelnDrache(): String {
        val wua = (1..3).random()
        val wus = (4..15).random()
        return "Würfelergebnis $wua ist $name mit Stärke $wus"
    }

    fun trefferstärkeErmittelnMagischerSchmied(): String {
        val wua = (1..6).random()
        val wus = (1..12).random()
        return "Würfelergebnis $wua ist $name hat eine Stärke von $wus"
    }
}

class Schmied(name: String, stärke: Int): Attacke(name, stärke)

class MagischerSchmied {
    private val kettenSchwert = Schmied("KettenSchwert", 5)
    private val blaster = Schmied("Blaster Kanone", 15)
    private val raketenArmbrust = Schmied("Eiszauber", 12)

    fun angrif() {
        val würfelergebnis = (1..6).random()
        when(würfelergebnis) {
            1 -> println(kettenSchwert.trefferstärkeErmittelnMagischerSchmied())
            2 -> println(blaster.trefferstärkeErmittelnMagischerSchmied())
            3 -> println(raketenArmbrust.trefferstärkeErmittelnMagischerSchmied())
        }
    }
}

fun main() {
    // Hier folgen die Angriffe der Helden und es wird mit Würfeln ermittelt und dann erfolgt die Ermittlung der
    // zufälligen Stärke

    // Magier Frabo hat drei zauber
    println("Frabo greift an!")
    val zauberer = Zauberer()
    zauberer.zaubern()

    // Drache Dogahn hat drei Attacken
    println("Dogahn greift an")
    val drache = Drache()
    drache.angreifen()

    println("Movin greift an")
    val magischerSchmied = MagischerSchmied()
    magischerSchmied.angrif()
}*/