/**class Frabo(name: String, gesundheit: Int, angriff: Int) : Held(name, gesundheit) {
    fun spezialFunktion() {
        val spezialAttacke = mutableMapOf(
            "eiszauber" to 12,
            "nebelzauber" to 12,
            "feuerBall" to 30
        )
        println("Frabo verwendet seine Spezialfunktion!")
    }
}*/
class Frabo(name: String, gesundheit: Int) : Held(name, gesundheit) {
    val beutel = Beutel("Heilzauber", 5, "Zauber", 30)
    val spezialAttacke = mutableMapOf(
        "eiszauber" to 12,
        "nebelzauber" to 12
    )

    fun heilen(ziel: Held) {
        val heilung = (ziel.gesundheit * 0.05).toInt()
        ziel.gesundheit += heilung
        println("$name heilt ${ziel.name} um $heilung Punkte!")
    }

    fun heileAlle(helden: List<Held>) {
        for (held in helden) {
            val heilung = (held.gesundheit * 0.3).toInt()
            held.gesundheit += heilung
            println("$name heilt alle Helden um $heilung Punkte!")
        }
    }

    override fun attack(): Int {
        // Wählt zufällig einen der Spezialangriffe aus
        val spezial = spezialAttacke.entries.random()
        println("Frabo verwendet seine Spezialfunktion ${spezial.key}!")
        return spezial.value
    }
}

