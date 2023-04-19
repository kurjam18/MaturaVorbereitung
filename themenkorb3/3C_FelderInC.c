#include <stdio.h>
#include <stdlib.h>
#include <math.h>
#include <time.h> 

int random1 (int min, int max) {

  int rv;
  rv = (rand()% (max - min + 1)) + min; 
  return rv;
}

void lottoZiehung(int f[]) {

    for(int i = 0 ; i < 6;  i++ ){
        f[i] = random1(1, 45);
    }

    for(int j = 0; j < 6; j++){
        for(int k = 0; k < 6; k++){

            if(j == k) {
                break;
            }

            if(f[j] == f[k]){

                f[j] = f[j]+1;   
            }
            continue;
        }
    }
}

void feldAusgabe(char* txt, int f[], int durchgaenge)
{
  int i;
  printf("%s\n", txt);
  for(i = 0; i < durchgaenge; i++)
    printf("%3.0d", f[i]);
    printf("\n");

}

void bubbleSort(int f[], int groesseFeld)  {

    int tmp;

    for(int i = 0; i < groesseFeld; i++) {
        for(int j = 0; j < (groesseFeld - 1); j++) {
            if(f[j] > f[j+1]) {
                tmp = f[j];
                f[j]= f[j+1];
                f[j+1]= tmp;
            }
        }
    }
}

int main () {

    int ziehungf[6];

    srand(time(NULL));

    lottoZiehung(ziehungf);
    bubbleSort(ziehungf, 6);
    feldAusgabe("Ziehung", ziehungf, 6);
}