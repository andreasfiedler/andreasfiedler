class Movin(name: String, gesundheit: Int) : Held(name, gesundheit) {

    // Attacken werden aufgerufen
    val spezialAttacke: MutableMap<String, Int> = mutableMapOf(
        "Kettenschwert" to 10,
        "Blaster Kanone" to 15,
        "Raketen Armbrust" to 30
    )

    // Helden Attacken werden zufällig aufgerufen
    override fun attack(): Int {
        val spezial = spezialAttacke.entries.random()
        println("$name verwendet seine Spezialfunktion ${spezial.key} ")
        val verstaerkung = beutel.verstaerkung(spezial.value)
        return verstaerkung

    }
}