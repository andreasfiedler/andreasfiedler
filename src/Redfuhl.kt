class Redfuhl(name: String, gesundheit: Int) : Held(name, gesundheit) {
    override val beutel = Beutel("Heilzauber", 5, "Zauber", 30)
    val spezialAttacke = mutableMapOf(
        "eiszauber" to 12,
        "nebelzauber" to 12,
        "feuerBall" to 30
    )

    override fun attack(): Int {
        val spezial = spezialAttacke.entries.random()
        println("$name verwendet seine Spezialfunktion ${spezial.key} ")

        // Now you can call verstaerkung() on beutel
        val verstaerkung = beutel.verstaerkung(spezial.value)

        return verstaerkung
    }
}