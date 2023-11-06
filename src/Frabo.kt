
 class Frabo(name: String, gesundheit: Int) : Held(name, gesundheit) {
    override val beutel = Beutel("Heilzauber", 5, "Zauber", 30)
    val spezialAttacke = mutableMapOf(
        "eiszauber" to 12,
        "nebelzauber" to 12,
        "feuerBall" to 30
    )

     // Zauber aus eigenen Beutel
    fun heilen(ziel: Held) {
        // Selbstheilung
        val heilung = (ziel.gesundheit * 0.5).toInt()
        ziel.gesundheit += heilung
        println("$name heilt ${ziel.name} um $heilung Punkte!")
    }





    fun heileAlle(helden: List<Held>) {
        // Alle Helden heilen
        for (held in helden) {
            val heilung = (held.gesundheit * 0.7).toInt()
            held.gesundheit += heilung
            println("$name heilt alle Helden um $heilung Punkte!")
        }
    }
    // Angriffe aus Methode oben
    override fun attack(): Int {
        val spezial = spezialAttacke.entries.random()
        println("$name verwendet seine Spezialfunktion ${spezial.key} ")
        val verstaerkung = beutel.verstaerkung(spezial.value)
        return verstaerkung
    }
}

