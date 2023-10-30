import kotlin.system.exitProcess

open class Held(val name: String, val stärke: Int, var gesundheit: Int) {
    fun trefferstärkeErmittelnMagie(): Int {
        return (1..12).random()
    }
    fun trefferstärkeErmittelnDrache(): Int {
        return (4..15).random()
    }
    fun trefferstärkeErmittelnMagischerSchmied(): Int {
        return (1..12).random()
    }

    fun verletzungBewerten(verletzung: Int) {
        when(verletzung) {
            in 2..3 -> println("Keine Verletzung")
            4 -> println("Streifschuss")
            in 5..6 -> println("Tiefe Wunde")
            in 7..10 -> println("Schwer verletzt")
            in 11..12 -> {
                println("Tödliche Verletzung")
                exitProcess(0)
            }
        }
        gesundheit -= verletzung
        println("Nach dem Angriff hat der Orgz noch $gesundheit Gesundheitspunkte.")
    }
}



/**open class Attacke(val name: String, val stärke: Int) {
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

    fun trefferstärkeErmitteln(): Int {
        return (1..12).random()
    }
}*/
