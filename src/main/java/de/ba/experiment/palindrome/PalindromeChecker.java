package de.ba.experiment.palindrome;

public class PalindromeChecker {

    /**
     * Prüft, ob ein gegebener String ein Palindrom ist.
     * <p>
     * Ein Palindrom liest sich vorwärts und rückwärts gleich.
     * <p>
     * (Siehe ausführliche Beschreibung in README.md)
     *
     * @param text der zu prüfende Text (kann null sein)
     * @return true, wenn der Text nach vorgegebener Definition ein Palindrom ist, sonst false
     */

    public static boolean isPalindrome(String text) {
        if (text == null) {
            return false;
        }

        text = text.toLowerCase().replaceAll(" ", "");

        if (text.isEmpty()) {
            return true;
        }

        for (int i = 0; i < text.length() / 2; i++) {
            if (text.charAt(i) != text.charAt(text.length() - 1 - i)) {
                return false;
            }
        }

        return true;
    }
}
