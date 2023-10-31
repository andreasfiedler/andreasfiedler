import kotlin.random.Random

open class Gegner(val name: String, var gesundheit: Int = 150) {
    var helferEingesetzt = false

    fun attack(): Int {
        // Zufällige Angriffsstärke zwischen 1 und 10
        return Random.nextInt(1, 20)
    }

    // Orgz verteidigt sich
    fun verteidigen(damage: Int) {
        gesundheit -= damage
        println("$name hat jetzt $gesundheit Gesundheitspunkte.")
    }

    // Orgz ruft Helfer
    fun rufeHelfer(): Int {
        if (!helferEingesetzt) {
            helferEingesetzt = true
            println("Orgz ruft Goblin zur Hilfe!")
            return Random.nextInt(1, 11)
        }
        return 0
    }
}

