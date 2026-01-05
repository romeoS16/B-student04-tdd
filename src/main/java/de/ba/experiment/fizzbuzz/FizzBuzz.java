package de.ba.experiment.fizzbuzz;

public class FizzBuzz {

    /**
     * Gibt für die Zahlen von 1 bis n jeweils einen String zurück.
     *
     * (Siehe ausführliche Beschreibung in README.md)
     *
     * @param n die größe des Arrays
     * @return ein String-Array der Länge n mit den FizzBuzz-Werten
     */

    public static String[] fizzBuzz(int n) {
        // TODO: implementieren
        String[] fizzBuzz = new String[n];
        for (int i = 1; i <= n; i++) {
            if (n<1) {
                return new String[0];
            }
            else if (i % 3 == 0 && i % 5 == 0) {
                fizzBuzz[i - 1] = "FizzBuzz";
            } else if (i % 3 == 0) {
                fizzBuzz[i - 1] = "Fizz";
            } else if (i % 5 == 0) {
                fizzBuzz[i - 1] = "Buzz";
            } else {
                fizzBuzz[i - 1] = String.valueOf(i);
            }
        }
        return fizzBuzz;
    }
}
