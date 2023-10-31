/**import kotlin.system.exitProcess

class Drachenangriff(name: String, stärke: Int, gesundheit: Int): Held(name, stärke, gesundheit)

class Drache {
    private val feuerangriff = Drachenangriff("Feuerangriff", 10, 100)
    private val eisangriff = Drachenangriff("Eisangriff", 15, 100)
    private val luftangriff = Drachenangriff("Luftangriff", 14, 100)
    private val tiefflug = Drachenangriff("Tiefflug", 7, 100)

    fun angreifen(): Int {
        val würfelergebnis = (1..6).random()
        val angriff = when(würfelergebnis) {
            1 -> feuerangriff
            2 -> eisangriff
            3 -> tiefflug
            else -> luftangriff
        }
        val stärke = angriff.trefferstärkeErmittelnDrache()
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
class Dogahn(name: String, gesundheit: Int) : Held(name, gesundheit) {
    fun spezialFunktion() {
        println("Dogahn verwendet seine Spezialfunktion!")
    }
}