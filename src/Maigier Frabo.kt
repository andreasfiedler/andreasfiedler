class Magie(name: String, stärke: Int): Attacke(name, stärke)
class Zauberer {
    private val sturm = Magie("Sturm", 5)
    private val nebelzauber = Magie("Nebelzauber", 10)
    private val eiszauber = Magie("Eiszauber", 12)

    fun zaubern() {
        val würfelergebnis = (1..6).random()
        when(würfelergebnis) {
            1 -> println(sturm.trefferstärkeErmittelnMagie())
            2 -> println(nebelzauber.trefferstärkeErmittelnMagie())
            3 -> println(eiszauber.trefferstärkeErmittelnMagie())

        }
    }
}