package de.ba.experiment.palindrome;

public class PalindromeChecker {

    /**
     * Prüft, ob ein gegebener String ein Palindrom ist.
     *
     * Ein Palindrom liest sich vorwärts und rückwärts gleich.
     *
     * (Siehe ausführliche Beschreibung in README.md)
     *
     * @param text der zu prüfende Text (kann null sein)
     * @return true, wenn der Text nach vorgegebener Definition ein Palindrom ist, sonst false
     */

    public static boolean isPalindrome(String text) {
        // TODO: implementieren
        text = text.toLowerCase();
        text = text.replaceAll(" ", "");
        for (int i = 0; i < text.length(); i++) {
            for (int j = text.length(); j == 0; j--) {
                if (text.charAt(i) != text.charAt(j)) {
                    return false;
                }
            }
        }
        return true;
    }
}
