package de.ba.experiment.palindrome;

import org.junit.Test;

import static org.junit.Assert.*;

public class PalindromeCheckerTest {

    // In dieser Gruppe arbeiten Sie mit TDD und dürfen zusätzlich KI nutzen.
    // Wichtig: Schreiben Sie zuerst eigene Testfälle OHNE KI,
    // bevor Sie eine KI um Hilfe bitten (siehe README.md).

    @Test
    public void simpleLowercasePalindrome_returnsTrue() {
        boolean result = PalindromeChecker.isPalindrome("anna");
        assertTrue(result);
    }

    // TODO: weitere Testfälle ergänzen
}
