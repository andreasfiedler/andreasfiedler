/**import kotlin.system.exitProcess

class Magie(name: String, stärke: Int, gesundheit: Int): Held(name, stärke, gesundheit)
class Zauberer {
    private val sturm = Magie("Sturm", 5, 100)
    private val nebelzauber = Magie("Nebelzauber", 10, 100)
    private val eiszauber = Magie("Eiszauber", 12, 100)


    /**fun zaubern(): Int {
        val würfelergebnis = (1..6).random()
        return when(würfelergebnis) {
            1 -> sturm.trefferstärkeErmittelnMagie().toInt()
            2 -> nebelzauber.trefferstärkeErmittelnMagie().toInt()
            else -> eiszauber.trefferstärkeErmittelnMagie().toInt()
        }
    }*/
    fun zaubern(): Int {
        val würfelergebnis = (1..6).random()
        val angriff = when(würfelergebnis) {
            1 -> sturm
            2 -> nebelzauber
            else -> eiszauber
        }
        val stärke = angriff.trefferstärkeErmittelnMagie()
        println("Die Würfelergebnis $würfelergebnis ist ${angriff.name} hat eine Stärke von $stärke")
        return stärke
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
}*/