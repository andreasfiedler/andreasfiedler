class Movin(name: String, gesundheit: Int) : Held(name, gesundheit) {
    val spezialAttacke: MutableMap<String, Int> = mutableMapOf(
        "Kettenschwert" to 10,
        "Blaster Kanone" to 15,
        "Raketen Armbrust" to 30
    )

    override fun attack(): Int {
        val spezial = spezialAttacke.entries.random()
        println("$name verwendet seine Spezialfunktion ${spezial.key} ")

        // Now you can call verstaerkung() on beutel
        val verstaerkung = beutel.verstaerkung(spezial.value)

        return verstaerkung
    }
}