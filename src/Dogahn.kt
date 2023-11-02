class Dogahn(name: String, gesundheit: Int) : Held(name, gesundheit) {

    val spezialAttack = mutableMapOf(
        "Eisiger Atem" to 12,
        "Feuriger Atem" to 12,
        "Tiefflug" to 30
    )
    override fun attack(): Int {
        // Wählt zufällig einen der Spezialangriffe aus
        val spezial = spezialAttack.entries.random()
        //val schaden = spezialAttacke.entries.random()
        println("$name verwendet seine Spezialfunktion ${spezial.key} ")
        return spezial.value
    }
}