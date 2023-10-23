class Drachenangriff(name: String, stärke: Int): Attacke(name, stärke)

class Drache {
    private val feuerangriff = Drachenangriff("Feuerangriff", 10)
    private val eisangriff = Drachenangriff("Eisangriff", 15)
    private val luftangriff = Drachenangriff("Luftangriff", 14)
    private val tiefflug = Drachenangriff("Tiefflug", 7)

    fun angreifen(): Int {
        val würfelergebnis = (1..6).random()
        val angriff = when(würfelergebnis) {
            1 -> feuerangriff
            2 -> eisangriff
            3 -> tiefflug
            else -> luftangriff
        }
        val stärke = angriff.trefferstärkeErmittelnMagie()
        println("Die Würfelergebnis $würfelergebnis ist ${angriff.name} hat eine Stärke von $stärke")
        return stärke
    }
}