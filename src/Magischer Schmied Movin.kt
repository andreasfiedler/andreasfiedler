class Schmied(name: String, stärke: Int): Attacke(name, stärke)

class MagischerSchmied {
    val kettenSchwert = Schmied("KettenSchwert", 5)
    val blaster = Schmied("Blaster Kanone", 15)
    val raketenArmbrust = Schmied("Raketen Armbrust", 17)
    val klingen = Schmied("Klingen", 14)
    val linksPlasmaRakete = Schmied("Plasmarakete", 17)
    fun schmied() {
        val würfelergebnis = (1..6).random()
        when(würfelergebnis) {
            1 -> println(kettenSchwert.trefferstärkeErmittelnMagischerSchmied())
            2 -> println(blaster.trefferstärkeErmittelnMagischerSchmied())
            3 -> println(raketenArmbrust.trefferstärkeErmittelnMagischerSchmied())
        }
    }

    fun redfuhl() {
    val würfelergebnis = (1..6).random()
    when(würfelergebnis) {
        4 -> println(klingen.trefferstärkeErmittelnMagischerSchmied())
        5 -> println(blaster.trefferstärkeErmittelnMagischerSchmied())
        3 -> println(linksPlasmaRakete.trefferstärkeErmittelnMagischerSchmied())
    }
}
}