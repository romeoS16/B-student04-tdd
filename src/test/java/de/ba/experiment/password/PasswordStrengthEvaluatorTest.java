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

    // TODO: weitere Tests ergänzen
}
