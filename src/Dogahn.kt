class Dogahn(name: String, gesundheit: Int) : Held(name, gesundheit) {
    // Zugriff auf den Heilzauber von Frabo
    override val beutel = Beutel("Heilzauber", 15, "Zauber", 30)
    // Attacken werden aufgerufen
    val spezialAttacke = mutableMapOf(
        "Eisiger Atem" to 12,
        "Feuriger Atem" to 12,
        "Tiefflug" to 30
    )

    // Helden Attacken werden zufällig aufgerufen
    override fun attack(): Int {
        val spezial = spezialAttacke.entries.random()
        println("$name verwendet seine Spezialfunktion ${spezial.key} ")
        val verstaerkung = beutel.verstaerkung(spezial.value)
        return verstaerkung
    }
}