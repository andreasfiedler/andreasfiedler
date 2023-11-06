class Redfuhl(name: String, gesundheit: Int) : Held(name, gesundheit) {
    override val beutel = Beutel("Heilzauber", 5, "Zauber", 30)
    val spezialAttacke = mutableMapOf(
        "Plasma Kanone" to 95,
        "Rad Klingen" to 12,
        "Plasma Rakete" to 80
    )

    override fun attack(): Int {
        val spezial = spezialAttacke.entries.random()
        println("$name verwendet seine Spezialfunktion ${spezial.key} ")
        val verstaerkung = beutel.verstaerkung(spezial.value)
        return verstaerkung
    }
}