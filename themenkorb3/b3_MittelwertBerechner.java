package themenkorb3;

public class b3_MittelwertBerechner {
    public static double berechneMittelwert(String input) {
        String[] werte = input.split(":");
        double summe = 0;
        int anzahl = 0;

        for (String wert : werte) {
            try {
                double zahl = Double.parseDouble(wert.trim());
                summe += zahl;
                anzahl++;
            } catch (NumberFormatException e) {
                // Ignoriere ungültige Werte
            }
        }

        if (anzahl > 0) {
            return summe / anzahl;
        } else {
            throw new IllegalArgumentException("Ungültige Eingabe: Es wurden keine gültigen Werte gefunden.");
        }
    }
}
