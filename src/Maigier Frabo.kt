class Magie(name: String, stärke: Int): Attacke(name, stärke)
class Zauberer {
    private val sturm = Magie("Sturm", 5)
    private val nebelzauber = Magie("Nebelzauber", 10)
    private val eiszauber = Magie("Eiszauber", 12)

    /**fun zaubern(): Int {
        val würfelergebnis = (1..6).random()
        return when(würfelergebnis) {
            1 -> sturm.trefferstärkeErmittelnMagie().toInt()
            2 -> nebelzauber.trefferstärkeErmittelnMagie().toInt()
            else -> eiszauber.trefferstärkeErmittelnMagie().toInt()
        }
    }*/
    fun zaubern(): Int {
        val würfelergebnis = (1..6).random()
        val angriff = when(würfelergebnis) {
            1 -> sturm
            2 -> nebelzauber
            else -> eiszauber
        }
        val stärke = angriff.trefferstärkeErmittelnMagie()
        println("Die Würfelergebnis $würfelergebnis ist ${angriff.name} hat eine Stärke von $stärke")
        return stärke
    }
}