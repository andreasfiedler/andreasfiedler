import kotlin.random.Random
class Gegner(val name: String = "Orgz", var gesundheit: Int = 350) {
    var helferEingesetzt = false

    fun attack(): Int {
        // Zufällige Angriffsstärke zwischen 1 und 10
        return Random.nextInt(1, 11)
    }

    fun verteidigen(damage: Int) {
        gesundheit -= damage
        println("$name hat jetzt $gesundheit Gesundheitspunkte.")
    }

    fun rufeHelfer(): Int {
        if (!helferEingesetzt) {
            helferEingesetzt = true
            println("$name ruft Goblin zur Hilfe!")
            return Random.nextInt(1, 11)
        }
        return 0
    }
}