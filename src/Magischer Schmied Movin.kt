import kotlin.system.exitProcess

class Schmied(name: String, stärke: Int, gesundheit: Int): Attacke(name, stärke, gesundheit)

class MagischerSchmied {
    val kettenSchwert = Schmied("KettenSchwert", 5, 100)
    val blaster = Schmied("Blaster Kanone", 15, 100)
    val raketenArmbrust = Schmied("Raketen Armbrust", 17, 100)
    val klingen = Schmied("Klingen", 14, 100)
    val linksPlasmaRakete = Schmied("Plasmarakete", 17, 100)
    fun schmied(): Int {
        val würfelergebnis = (1..6).random()
        return when(würfelergebnis) {
            1 -> kettenSchwert.trefferstärkeErmittelnMagischerSchmied()
            2 -> blaster.trefferstärkeErmittelnMagischerSchmied()
            else -> raketenArmbrust.trefferstärkeErmittelnMagischerSchmied()
        }
    }

    fun redfuhl(): Int {
        val würfelergebnis = (1..6).random()
        return when(würfelergebnis) {
            4 -> klingen.trefferstärkeErmittelnMagischerSchmied()
            5 -> blaster.trefferstärkeErmittelnMagischerSchmied()
            else -> linksPlasmaRakete.trefferstärkeErmittelnMagischerSchmied()
        }
    }
    fun verletzungBerechnen(verletzung: Int) {
        var gesundheit: Int = 100
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
