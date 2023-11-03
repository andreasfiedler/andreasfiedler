class Redfuhl(name: String, gesundheit: Int) : Held(name, gesundheit) {

    val spezialAttacke = mutableMapOf(
        "eiszauber" to 12,
        "nebelzauber" to 12,
        "feuerBall" to 30
    )

    override fun attack(): Int {
        // Wählt zufällig einen der Spezialangriffe aus
        val spezial = spezialAttacke.entries.random()
        //val schaden = spezialAttacke.entries.random()
        println("Frabo verwendet seine Spezialfunktion ${spezial.key} ")
        return spezial.value
    }
}