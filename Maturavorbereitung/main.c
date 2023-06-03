#include <stdio.h>
#include <math.h>

#define MAX_ANZAHL 100

int eingabeZahl(int ug, int og, double *zahl) {
    printf("Bitte geben Sie eine Zahl zwischen %d und %d ein: ", ug, og);
    if (scanf("%lf", zahl) != 1) {
        // Fehlerhafte Eingabe
        return 1;
    }
    
    if (*zahl < ug || *zahl > og) {
        // Zahl ist außerhalb des erlaubten Bereichs
        return 1;
    }
    
    return 0;
}
/*
int main() {
    double werte[MAX_ANZAHL];
    int anzahl;
    
    printf("Wie viele Werte möchten Sie eingeben? (max. %d): ", MAX_ANZAHL);
    scanf("%d", &anzahl);
    
    if (anzahl <= 0 || anzahl > MAX_ANZAHL) {
        printf("Ungültige Anzahl von Werten.\n");
        return 1;
    }
    
    // Werte eingeben
    int i;
    for (i = 0; i < anzahl; i++) {
        int ergebnis = eingabeZahl(1, 100, &werte[i]);
        if (ergebnis == 1) {
            printf("Fehlerhafte Eingabe.\n");
            return 1;
        }
    }
    
    // Arithmetisches Mittel berechnen
    double summe = 0.0;
    for (i = 0; i < anzahl; i++) {
        summe += werte[i];
    }
    double mittelwert = summe / anzahl;
    
    // Standardabweichung berechnen
    double abweichung = 0.0;
    for (i = 0; i < anzahl; i++) {
        abweichung += pow(werte[i] - mittelwert, 2);
    }
    double standardabweichung = sqrt(abweichung / anzahl);
    
    printf("Arithmetisches Mittel: %.2lf\n", mittelwert);
    printf("Standardabweichung: %.2lf\n", standardabweichung);
    
    return 0;
}
*/