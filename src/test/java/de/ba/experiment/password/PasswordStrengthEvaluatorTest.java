package de.ba.experiment.password;

import org.junit.Test;

import static org.junit.Assert.*;

public class PasswordStrengthEvaluatorTest {

    // In dieser Gruppe arbeiten Sie mit TDD und dürfen zusätzlich KI nutzen.
    // Wichtig: Schreiben Sie zuerst eigene Testfälle OHNE KI,
    // bevor Sie eine KI um Hilfe bitten (siehe README.md).

    @Test
    public void nullPassword_isWeak() {
        String result = PasswordStrengthEvaluator.evaluateStrength("ab1");
        assertEquals("WEAK", result);
    }

    @Test
    public void nullPassword_isEmpty() {
        String result = PasswordStrengthEvaluator.evaluateStrength("");
        assertEquals("WEAK", result);
    }

    @Test
    public void nullPassword_isSpacebar() {
        String result = PasswordStrengthEvaluator.evaluateStrength(" ");
        assertEquals("WEAK", result);
    }

    @Test
    public void nullPassword_isNull() {
        String result = PasswordStrengthEvaluator.evaluateStrength(null);
        assertEquals("WEAK", result);
    }

    @Test
    public void nullPassword_lengthLowerThenSix() {
        String result = PasswordStrengthEvaluator.evaluateStrength("123456");
        assertEquals("WEAK", result);
    }

    @Test
    public void nullPassword_isWEAK2PointsSmallNumber() {
        String result = PasswordStrengthEvaluator.evaluateStrength("abc123");
        assertEquals("WEAK", result);
    }

    @Test
    public void nullPassword_isWEAK2PointsBigSpecialCharacter() {
        String result = PasswordStrengthEvaluator.evaluateStrength("ABC!!!");
        assertEquals("WEAK", result);
    }

    @Test
    public void nullPassword_isMedium() {
        String result = PasswordStrengthEvaluator.evaluateStrength("Abc123");
        assertEquals("MEDIUM", result);
    }
    @Test
    public void nullPassword_isSTRONG() {
        String result = PasswordStrengthEvaluator.evaluateStrength("aaaAAAbbb!223j");
        assertEquals("STRONG", result);
    }

    // TODO: weitere Tests ergänzen
}
