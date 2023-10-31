import kotlin.random.Random



open class Held(val name: String, var gesundheit: Int) {
    open fun attack(): Int {
        // Zufällige Angriffsstärke zwischen 1 und 10
        return Random.nextInt(1, 11)
    }

    fun verteidigen(damage: Int) {
        gesundheit -= damage
        println("$name hat jetzt $gesundheit Gesundheitspunkte.")
    }
}



