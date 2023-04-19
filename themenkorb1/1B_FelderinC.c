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
    int arr[] = {5, 2, 8, 3, 1};
    int n = sizeof(arr)/sizeof(arr[0]);
    int min = arr[0];
    int min2 = arr[0]; 
    
    //bubble sort lösung 
    /*bubble_sort(arr, n);
    printf("Kleinstes Element: %d\n", arr[0]);
    printf("Zweitkleinstes Element: %d\n", arr[1]);*/

    //Simple Lösung 
    for( int i = 0; i < n; i++ ){ 
        if(arr[i] < min){
            min2 = min;
            min = arr[i]; 
        }else if(arr[i] < min2){
           min2 = arr[i]; 
        }
    }
    printf("Kleinstes %d \n", min); 
    printf("2. Kleinstes %d\n", min2);


    return 0;
}