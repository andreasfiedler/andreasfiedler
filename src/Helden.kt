import kotlin.random.Random

open class Held(val name: String, var gesundheit: Int = 50) {
    fun attack(): Int {
        // Zufällige Angriffsstärke zwischen 1 und 10
        return Random.nextInt(1, 15)
    }
    // Verteidigen des Helds
    fun verteidigen(damage: Int) {
        gesundheit -= damage
        println("$name hat jetzt $gesundheit Gesundheitspunkte.")
    }
}



