#include <stdio.h>
#include <math.h>
#include <stdlib.h>
#include <time.h>

struct Koordinaten{
    int x;
    int y;
};

int main() {
    struct Koordinaten feld[10];
    
    srand(time(NULL)); 
    for (int i = 0; i < 10; i++) {
        feld[i].x = rand() % 201 - 100; 
        feld[i].y = rand() % 201 - 100;
    }
    
    for (int i = 0; i < 10; i++) {
        printf("Koordinate %d: (%d, %d)\n", i+1, feld[i].x, feld[i].y);
    }
    
    double kleinstAbst = INFINITY; 
    int index1, index2; 
    for (int i = 0; i < 10; i++) {
        for (int j = i+1; j < 10; j++) {
            double abstand = sqrt(pow(feld[j].x - feld[i].x, 2) + pow(feld[j].y - feld[i].y, 2));
            if (abstand < kleinstAbst) {
                kleinstAbst = abstand;
                index1 = i;
                index2 = j;
            }
        }
    }
    printf("Kleinsten Abstand: %lf\n", kleinstAbst);
    printf("Zwischen den Koordinaten %d und %d\n", index1+1, index2+1);
    
    return 0;
}
