
class Movin(name: String, gesundheit: Int) : Held(name, gesundheit) {
    constructor(name: String, gesundheit: Int, spezialFunktion: MutableMap<String, Int> ) : this(name, gesundheit) {

    }


    fun spezialAttacke() {
        val spezialAttack: MutableMap<String, Int> = mutableMapOf(
        "Kettenschwert" to 10,
        "Blaster Kanone" to 15,
        "Raketen Armbrust" to 30
    )
        //println("$name verwendet seine Spezialfunktion ${spezialAttacke}!")
    }

    override fun attack(): Int {

        //val spezial = spezialAttacke().entries.random()
        //val schaden = spezialAttacke.entries.random()
        println("$name verwendet seine Spezialfunktion ${spezialAttacke()} ")
        return super.attack()
    }
}


