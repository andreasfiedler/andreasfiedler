package Enums

enum class Schwierigkeit {
    // Leicht hat einen Multiplikator von 0.5
    LEICHT {
        // wird aufgerufen durch die Main bei der auswahl Leicht
        override fun getDifficultyMultiplier(): Double {
            return 0.5
        }
        // wird aufgerufen durch die Main bei der auswahl Leicht
        override fun getDescription(): String {
            return "Leicht"
        }

    },
    // Mittel hat einen Multiplikator von 1.0
    MITTEL {
        // wird aufgerufen durch die Main bei der auswahl Mittel
        override fun getDifficultyMultiplier(): Double {
            return 1.0
        }
        // wird aufgerufen durch die Main bei der auswahl Mittel
        override fun getDescription(): String {
            return "Mittel"
        }
    },
    // Schwer hat einen Multiplikator von 01.5
    SCHWER {
        // wird aufgerufen durch die Main bei der auswahl Schwer
        override fun getDifficultyMultiplier(): Double {
            return 1.5
        }
        // wird aufgerufen durch die Main bei der auswahl Schwer
        override fun getDescription(): String {
            return "Schwer"
        }
    };

    // Diese abstrackte Funktion greift auf die Multiplikatoren zu, von LEICHT, MITTEL und SCHWER und ermittelt den Wert in Double
    // Dieser wird in der Main aufgerufen.
    abstract fun getDifficultyMultiplier(): Double
    // Diese abstrackte Funktion greift auf die Multiplikatoren zu, von LEICHT, MITTEL und SCHWER und erhält den Wert String
    // Dieser wird in der Main aufgerufen.
    abstract fun getDescription(): String

}
