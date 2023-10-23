fun main() {
    // Hier folgen die Angriffe der Helden und es wird mit Würfeln ermittelt und dann erfolgt die Ermittlung der
    // zufälligen Stärke

    // Magier Frabo hat drei zauber
    println("Frabo greift an!")
    val zauberer = Zauberer()
    zauberer.zaubern()
    // Drache Dogahn hat drei Attacken
    println("Dogahn greift an")
    val drache = Drache()
    drache.angreifen()

    // Magischerschmied Movin
    println("Movin greift an")
    val magischerSchmied = MagischerSchmied()
    magischerSchmied.schmied()
    // Zusatz Attacke Motorrad
    println("Zusatz Attacke Motorrad")
    magischerSchmied.redfuhl()
}

