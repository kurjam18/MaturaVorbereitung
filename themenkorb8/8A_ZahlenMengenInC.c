#include <stdio.h>
#include <stdlib.h>
#include <string.h>

int main() {
    int zahl;
    printf("Geben Sie eine Zahl ein: ");
    scanf("%d", &zahl);

    // Hexadezimalausgabe
    printf("Hexadezimal: %X\n", zahl);

    // Binärausgabe  --> als schleife realisieren 
	printf("Binär: %b\n", zahl);
	
    // Stringausgabe
    char str[100];
    sprintf(str, "%d", zahl);
    printf("String: %s\n", str);

    return 0;
}