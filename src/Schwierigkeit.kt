package Enums

enum class Schwierigkeit {
    Leicht, MITTEL, SCHWER;
}

fun schwierigkeitFromIndex(index: Int): Schwierigkeit{
    return when (index){
        1 -> Schwierigkeit.Leicht
        2 -> Schwierigkeit.MITTEL
        3 -> Schwierigkeit.SCHWER
        else -> throw Exception("Ungültige Schwierigkeit")
    }
}
