class Beutel(var heilen: String, var staerke: Int, var zauber: String, var treffer: Int) {

    // Beutel Funktion wird aller 4 Runden aufgerufen
    fun verstaerkung(spezialAttackeValue: Int): Int {
        return (spezialAttackeValue * (0.5 + treffer / 100.0)).toInt()
    }
}