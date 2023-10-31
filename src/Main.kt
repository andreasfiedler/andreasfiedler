fun main() {
    val helden = listOf(Held("Frabo", 75), Held("Dogahn", 100), Held("Movin", 75), Held("Redfuhl",35))
    var gegner = Gegner()

    while (gegner.gesundheit > 0 && helden.any { it.gesundheit > 0 }) {
        println("\u001b[93mWähle einen Helden aus (1-4):\u001b[0m")
        val auswahl = readln().toIntOrNull()
        if (auswahl in 1..4) {
            val held = helden[auswahl?.minus(1)!!]
            if (held.gesundheit <= 0) {
                println("\u001b[31m${held.name} ist bereits besiegt.\u001b[0m")
                continue
            }
            println("${held.name} greift an!")
            for (i in 1..1) {
                val damage = held.attack()
                gegner.verteidigen(damage)
                if (gegner.gesundheit <= 0) break
            }
            if (gegner.gesundheit > 0) {
                println("Orgz greift an!")
                val damage = gegner.attack()
                held.verteidigen(damage)

                if (!gegner.helferEingesetzt) {
                    val helferDamage = gegner.rufeHelfer()
                    held.verteidigen(helferDamage)
                }
            }
        } else {
            println("\u001b[35mUngültige Auswahl.\u001B[0m")
        }
    }

    if (gegner.gesundheit <= 0) {
        println("\u001b[34mDie Helden haben gewonnen!\u001b[0m")
    } else {
        println("\u001b[33mOrgz hat gewonnen!\u001b[0m")
    }
}