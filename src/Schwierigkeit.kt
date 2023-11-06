package Enums

enum class Schwierigkeit {
    LEICHT {
        override fun getDifficultyMultiplier(): Double {
            return 0.5
        }

        override fun getDescription(): String {
            return "Leicht"
        }

    },
    MITTEL {
        override fun getDifficultyMultiplier(): Double {
            return 1.0
        }

        override fun getDescription(): String {
            return "Mittel"
        }
    },
    SCHWER {
        override fun getDifficultyMultiplier(): Double {
            return 1.5
        }

        override fun getDescription(): String {
            return "Schwer"
        }
    };


    abstract fun getDifficultyMultiplier(): Double
    abstract fun getDescription(): String


// Leicht, MITTEL, SCHWER;
}
/*
fun schwierigkeitFromIndex(index: Int): Schwierigkeit{
    return when (index){
        1 -> Schwierigkeit.LEICHT
        2 -> Schwierigkeit.MITTEL
        3 -> Schwierigkeit.SCHWER
        else -> throw Exception("Ungültige Schwierigkeit")
    }
}
*/