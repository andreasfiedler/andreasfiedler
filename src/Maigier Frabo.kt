/**class Frabo(name: String, gesundheit: Int, angriff: Int) : Held(name, gesundheit) {
    fun spezialFunktion() {
        val spezialAttacke = mutableMapOf(
            "eiszauber" to 12,
            "nebelzauber" to 12,
            "feuerBall" to 30
        )
        println("Frabo verwendet seine Spezialfunktion!")
    }
}*/
class Frabo(name: String, gesundheit: Int) : Held(name, gesundheit) {
    val spezialAttacke = mutableMapOf(
        "eiszauber" to 12,
        "nebelzauber" to 12
    )

    override fun attack(): Int {
        println("Frabo verwendet seine Spezialfunktion!")
        // Wählt zufällig einen der Spezialangriffe aus
        val spezial = spezialAttacke.entries.random()
        println("${spezial.key} verursacht ${spezial.value} Schaden!")
        return spezial.value
    }
}