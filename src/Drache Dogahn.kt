class Drachenangriff(name: String, stärke: Int): Attacke(name, stärke)

class Drache {
    private val feuerangriff = Drachenangriff("Feuerangriff", 10)
    private val eisangriff = Drachenangriff("Eisangriff", 15)
    private val luftangriff = Drachenangriff("Luftangriff", 14)

    fun angreifen() {
        val würfelergebnis = (1..3).random()
        when(würfelergebnis) {
            1 -> println(feuerangriff.trefferstärkeErmittelnDrache())
            2 -> println(eisangriff.trefferstärkeErmittelnDrache())
            3 -> println(luftangriff.trefferstärkeErmittelnDrache())
        }
    }
}