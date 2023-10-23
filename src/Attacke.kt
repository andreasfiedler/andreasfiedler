open class Attacke(val name: String, val stärke: Int) {
    fun trefferstärkeErmittelnMagie(): String {
        val wua = (1..6).random()
        val wus = (1..12).random()
        return "Die Würfelergebnis $wua ist $name hat eine Stärke von $wus"
    }
    fun trefferstärkeErmittelnDrache(): String {
        val wua = (1..3).random()
        val wus = (4..15).random()
        return "Würfelergebnis $wua ist $name mit Stärke $wus"
    }
    fun trefferstärkeErmittelnMagischerSchmied(): String {
        val wua = (1..6).random()
        val wus = (1..12).random()
        return "Würfelergebnis $wua ist $name hat eine Stärke von $wus"
    }
}
