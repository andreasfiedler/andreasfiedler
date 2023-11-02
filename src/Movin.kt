
class Movin(name: String, gesundheit: Int) : Held(name, gesundheit) {

        val spezialAttacke: MutableMap<String, Int> = mutableMapOf(
        "Kettenschwert" to 10,
        "Blaster Kanone" to 15,
        "Raketen Armbrust" to 30

    )



    override fun attack(): Int {
        // Wählt zufällig einen der Spezialangriffe aus
        val spezial = spezialAttacke.entries.random()
        //val schaden = spezialAttacke.entries.random()
        println("$name verwendet seine Spezialfunktion ${spezial.key} ")
        return spezial.value
    }
}


