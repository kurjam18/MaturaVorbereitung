/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/cFiles/main.c to edit this template
 */

/* 
 * File:   4D_FehlerBehandlung.c
 * Author: kurzmann
 *
 * Created on June 3, 2023, 11:42 AM
 */

#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include <errno.h>

#define MAX_LINE_LENGTH 100
/*
int main() {
    FILE *file;
    char line[MAX_LINE_LENGTH];
    char *token;
    int value;
    
    // Dateinamen der CSV-Datei
    const char *filename = "data.csv";

    // Datei öffnen
    file = fopen(filename, "r");
    if (file == NULL) {
        printf("Fehler beim Öffnen der Datei: %s\n", strerror(errno));
        return errno;
    }

    // Zeilenweise Lesen
    while (fgets(line, MAX_LINE_LENGTH, file)) {
        // Tokenisierung
        token = strtok(line, ",");
        while (token != NULL) {
            // Integer-Wert aus dem Token extrahieren
            value = atoi(token);
            printf("Wert: %d\n", value);

            // Nächstes Token
            token = strtok(NULL, ",");
        }
    }

    // Datei schließen
    fclose(file);

    return 0;
}


*/