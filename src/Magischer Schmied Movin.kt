class Schmied(name: String, stärke: Int): Attacke(name, stärke)

class MagischerSchmied {
    val kettenSchwert = Schmied("KettenSchwert", 5)
    val blaster = Schmied("Blaster Kanone", 15)
    val raketenArmbrust = Schmied("Raketen Armbrust", 17)
    val klingen = Schmied("Klingen", 14)
    val linksPlasmaRakete = Schmied("Plasmarakete", 17)
    fun schmied(): Int {
        val würfelergebnis = (1..6).random()
        return when(würfelergebnis) {
            1 -> kettenSchwert.trefferstärkeErmittelnMagischerSchmied().toInt()
            2 -> blaster.trefferstärkeErmittelnMagischerSchmied().toInt()
            else -> raketenArmbrust.trefferstärkeErmittelnMagischerSchmied().toInt()
        }
    }

    fun redfuhl(): Int {
        val würfelergebnis = (1..6).random()
        return when(würfelergebnis) {
            4 -> klingen.trefferstärkeErmittelnMagischerSchmied().toInt()
            5 -> blaster.trefferstärkeErmittelnMagischerSchmied().toInt()
            else -> linksPlasmaRakete.trefferstärkeErmittelnMagischerSchmied().toInt()
        }
    }
}
