#include <stdio.h>
#include <math.h>

int main() {
   int  a, b, c;
   int start = 1; 
   int end = 10;

    for (a = start; a <= end; a++) {
        for (b = a + 1; b <= end; b++) {
            c = sqrt(a * a + b * b);
            if (c > end) break;
            if (c * c == a * a + b * b) {
                printf("%d, %d, %d\n", a, b, c);
            }
        }
    }
    return 0;
}
