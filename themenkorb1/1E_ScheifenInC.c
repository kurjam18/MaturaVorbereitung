#include <stdio.h>

//in eine Funktion auslagern Startwert wird übergeben und nächste primzahl als retrun zurückgegeben

int main() {
   int  i, j;
   int start = 0; 
   int end = 20; 
   int is_prime;
   
   for (i = start; i <= end; i++) {
      is_prime = 1;
      
      for (j = 2; j < i; j++) {
         if (i % j == 0) {
            is_prime = 0;
            break;
         }
      }
      
      if (is_prime) {
        printf("%d ", i);
      }
   }
   return 0;
}