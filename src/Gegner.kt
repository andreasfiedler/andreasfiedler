import kotlin.system.exitProcess

open class GegnerBlack(val name: String, val angriff: Int, val verteidigen: Int, val gesundheit: Int) {

    val gegnerBlack: String = mutableListOf("Orgz" to 35, "Goblin" to 15).toString()

    fun verletzungBewerten(verletzung: Int) {
        var gesundheit: Int = 200
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