#include <stdio.h>

int main() {
    int stueckzahl = 250;
    double stueckkosten = 12;
    double gesamtkosten, rabatt;

    if (stueckzahl >= 1000) {
        rabatt = 0.2;
    } else if (stueckzahl >= 200) {
        rabatt = 0.15;
    } else if (stueckzahl >= 50) {
        rabatt = 0.1;
    } else {
        rabatt = 0;
    }

    gesamtkosten = stueckzahl * stueckkosten * (1 - rabatt);
    printf("Die Gesamtkosten betragen: %.2f\n", gesamtkosten);
    return 0;
}