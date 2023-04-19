#include <stdio.h>


void bubble_sort(int arr[], int n) {
    int i, j, temp;
    for (i = 0; i < n-1; i++) {
        for (j = 0; j < n-i-1; j++) {
            if (arr[j] > arr[j+1]) {
                temp = arr[j];
                arr[j] = arr[j+1];
                arr[j+1] = temp;
            }
        }
    }
}

int main() {
    int arr[] = {10, 7, 3, 15, 6, 8, 12};
    int n = sizeof(arr)/sizeof(arr[0]);
    int max;
    int max2; 
    max = arr[0];


    //Bubble Sort lösung 
    /*bubble_sort(arr, n);
    printf("Das größte Element ist %d\n", arr[n-1]);
    printf("Das zweitgrößte Element ist %d\n", arr[n-2]); */

    // simplste  lösung
    for( int i = 0; i < n; i++ ){ 
        if(arr[i] > max){
            max2 = max;
            max = arr[i]; 
        }else if(arr[i] > max2){
           max2 = arr[i]; 
        }
    }
    printf("Größte %d \n", max); 
    printf("2. Größte %d\n", max2);

    return 0;
}
