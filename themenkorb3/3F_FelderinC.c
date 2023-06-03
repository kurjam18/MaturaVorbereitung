/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/cFiles/main.c to edit this template
 */

/* 
 * File:   3F_FelderinC.c
 * Author: kurzmann
 *
 * Created on June 3, 2023, 12:50 PM
 */

#include <stdio.h>
#include <stdlib.h>
#include <time.h>

/*
 * 
 */

int intRandom (int min, int max) {
  
  int rv;
  rv = (rand()% (max - min + 1)) + min; 
}

void feldAusgabe(char* txt, int f[], int anzahl)
{
  int i;
  printf("%s\n", txt);
  for (i=0;i<anzahl;i++)
    printf(" Spiel%d:  %d\n", i+1, f[i]);
  printf("\n");
  if ((anzahl % 10) > 0)
    printf("\n");
}

int main (int argc, char** argv) {

	int spiele[11]; //1 == Sieger Team A | 0 == Unentschieden | 2 == Sieger Team B
	
	srand(time(NULL));
	
	for(int i = 0; i < 11; i++){
		spiele[i] = intRandom(0, 2); 
	}
	feldAusgabe("Totto", spiele,11); 
	return (EXIT_SUCCESS);
}

