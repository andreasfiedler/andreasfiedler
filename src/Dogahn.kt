class Dogahn(name: String, gesundheit: Int) : Held(name, gesundheit) {
    override val beutel = Beutel("Heilzauber", 5, "Zauber", 30)
    val spezialAttack = mutableMapOf(
        "Eisiger Atem" to 12,
        "Feuriger Atem" to 12,
        "Tiefflug" to 30
    )
    override fun attack(): Int {
        val spezial = spezialAttack.entries.random()
        println("$name verwendet seine Spezialfunktion ${spezial.key} ")

        // Now you can call verstaerkung() on beutel
        val verstaerkung = beutel.verstaerkung(spezial.value)

        return verstaerkung
    }
}