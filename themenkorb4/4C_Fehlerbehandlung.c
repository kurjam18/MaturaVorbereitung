#include <stdio.h>
#include <math.h>

//Eingabe wie 2. klasse, dannch rechner funktion mit feld und anzahl ergebnis als zeiger zurück -> return als fehlerbehandlung 


int eingabeZahl( int ug, int og, int *zahl) {
    int ok = 0;
    char s[100];

    do{
        if(ok)
          printf(" Bitte geben sie eine zahl zwischen %d und %d ein", ug, og);
        
        printf(" Bitte geben sie eine zahl zwischen %d und %d ein", ug, og);
        fgets(s, sizeof(s), stdin);
        fflush(stdin);

        if(s[0] == '<') 
            return 0;
        

        ok = sscanf(s, "%d", zahl);
        ok &=(*zahl >= ug) && (*zahl <= og);

    }while(!ok);
    return 1;
}




int main()
{
    float data[100];
    int n, i;
	int min = 0; 
	int max = 20;
    float mittel = 0.0; 
	float sd = 0.0;
	float abweichung = 0.0;

    printf("Anzahl der Daten eingeben: ");
    scanf("%d", &n);
    if(n > 100){
        printf("Zu viele Daten");
        return 2; 
    }

    printf("Geben Sie die Daten ein:\n");
    for(i=0; i<n; ++i){
        scanf("%f", &data[i]);
		if(data[i] < min || data[i] > max){
			printf("ungültiger wert");
			return 1; 
		}
        mittel += data[i];
    }
    mittel = mittel/n;

    for(int i=0; i<n; ++i){
        abweichung += (data[i]-mittel)*(data[i]-mittel);
    }
        
    sd = sqrt(abweichung/(n-1));
    printf("Durchschnitt = %.2f\n", mittel);
    printf("Standardabweichung = %.2f", sd);

    return 0;
}


