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
    bubble_sort(arr, n);
    printf("Das größte Element ist %d\n", arr[n-1]);
    printf("Das zweitgrößte Element ist %d\n", arr[n-2]);
    return 0;
}
