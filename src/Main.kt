fun main() {
    // Hier folgen die Angriffe der Helden und es wird mit Würfeln ermittelt und dann erfolgt die Ermittlung der
    // zufälligen Stärke

    val orgz = Orgz(100)

    // Magier Frabo hat drei zauber
    println("Frabo greift an!")
    val zauberer = Zauberer()
    //zauberer.zaubern()
    orgz.verletzungBewerten(zauberer.zaubern())

    // Drache Dogahn hat drei Attacken
    println("Dogahn greift an")
    val drache = Drache()
    //drache.angreifen()
    orgz.verletzungBewerten(drache.angreifen())

    // Magischerschmied Movin
    println("Movin greift an")
    val magischerSchmied = MagischerSchmied()
    magischerSchmied.schmied()
    orgz.verletzungBewerten(magischerSchmied.schmied())
    // Zusatz Attacke Motorrad
    println("Zusatz Attacke Motorrad")
    magischerSchmied.redfuhl()
    orgz.verletzungBewerten(magischerSchmied.redfuhl())


}

