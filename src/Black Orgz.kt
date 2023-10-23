import kotlin.system.exitProcess

class Orgz(var gesundheit: Int) {
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