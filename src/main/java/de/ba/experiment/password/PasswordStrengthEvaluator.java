package de.ba.experiment.password;

public class PasswordStrengthEvaluator {

    /**
     * Bewertet die Stärke eines Passworts.
     *
     * (Siehe ausführliche Beschreibung in README.md)
     *
     * @param password das zu prüfende Passwort
     * @return "WEAK", "MEDIUM" oder "STRONG" nach Definition
     */

    public static String evaluateStrength(String password) {
        // TODO: implementieren
        if (password == null) {
            return "WEAK";
        }
        if (password.isEmpty() || password.equals(" ") || password.length() < 6) {
            return "WEAK";
        }
        int points = 0;
        if (password.length() >= 10) {
            points = points +1;
        }

        if (password.matches(".*[a-z].*")) {
            points++; // mindestens ein Kleinbuchstabe
        }

        if (password.matches(".*[A-Z].*")) {
            points++; // mindestens ein Großbuchstabe
        }

        if (password.matches(".*\\d.*")) {
            points++; // mindestens eine Ziffer
        }

        if (password.matches(".*[^a-zA-Z0-9].*")) {
            points++; // mindestens ein Sonderzeichen
        }

        if (points <= 2) {
            return "WEAK";
        }
        if (points == 3) {
            return "MEDIUM";
        }
        if (points >= 4) {
            return "STRONG";
        }
        return "WEAK";
    }
}
