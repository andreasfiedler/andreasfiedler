class Redfuhl(name: String, gesundheit: Int) : Held(name, gesundheit) {

    // Attacken werden aufgerufen
    val spezialAttacke = mutableMapOf(
        "Plasma Kanone" to 95,
        "Rad Klingen" to 12,
        "Plasma Rakete" to 80
    )

    // Helden Attacken werden zufällig aufgerufen
    override fun attack(): Int {
        val spezial = spezialAttacke.entries.random()
        println("$name verwendet seine Spezialfunktion ${spezial.key} ")
        val verstaerkung = beutel.verstaerkung(spezial.value)
        return verstaerkung
    }
}