

open class Held(val name: String, var gesundheit: Int) {
    open val beutel = Beutel("Heilzauber", 5, "Zauber", 30)
    open fun attack(): Int {
        // Zufällige Angriffsstärke zwischen 1 und 10
        val damage = (1..12).random()

        println("$name greift an und verursacht $damage Schaden!")
        return damage
    }

    fun verteidigen(damage: Int) {
        gesundheit -= damage
        println("$name hat jetzt $gesundheit Gesundheitspunkte.")
    }


}


