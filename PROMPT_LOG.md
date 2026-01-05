# PROMPT_LOG

**Beispiel:**  

[Aufgabe xxx]  
[2025-11-22 10:27]  
Prompt: "Implementiere isPalindrome(String) mit Ignorieren von Leerzeichen."  
-> Code übernommen, aber für null angepasst.

[2025-11-22 10:35]  
Prompt: KI nach Randfalltests gefragt.  
-> 1 Test übernommen, 1 verworfen.   

[2026-01-05 12:00]  
Prompt:
public static String[] fizzBuzz(int n) {
// TODO: implementieren
String[] fizzBuzz = new String[n];
for (int i = 1; i < n; i++) {
if (i % 3 == 0) fizzBuzz[i-1] = "Fizz";
if (i % 3 != 0 && i % 5 != 0) fizzBuzz[i-1] = String.valueOf(i);
}
return fizzBuzz;
}
Prompt:
bei Teilbar durch 3 und 5 soll fizzbuzz geschrieben werden

-> 
public static String[] fizzBuzz(int n) {
String[] fizzBuzz = new String[n];

    for (int i = 1; i <= n; i++) {
        if (i % 3 == 0 && i % 5 == 0) {
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
[2026-01-05 12:25]
Prompt:
public static boolean isPalindrome(String text) {
// TODO: implementieren
if (text == null) {
return false;
}
text = text.toLowerCase();
text = text.replaceAll(" ", "");
if (text == "") {
return true;
}

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
->
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
[2026-01-05 12:25]
Prompt:
if (password.equals(null)) {
return "WEAK";
}

->
if (password == null) {
return "WEAK";
}
[2026-01-05 12:42]
Prompt:
Schreib mir ein Regex für diese Kriterien:
hat mindestens einen Kleinbuchstaben [a-z]
hat mindestens einen Großbuchstaben [A-Z]
hat mindestens eine Ziffer [0-9]
hat mindestens ein Sonderzeichen (nicht Buchstabe und nicht Ziffer)

schreib mir das so das ich für jedes kriterium einen Punkt auf die Int variable points addiere wenn sie erfüllt sind

->
int points = 0;

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


---

