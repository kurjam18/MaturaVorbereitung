#include <stdio.h>

int main() {
    char input[] = {'H','A', 'L', 'L', 'O', '0'};
    char word[100]; 
    int i = 0, j = 0;
    while (input[i] != '0') {
        if (input[i] == ' ') {
            word[j] = '0';  
            printf("%s\n", word);
            j = 0;
        } else {
            word[j] = input[i];
            j++;
        }
        i++;
    }
    word[j] = '\0';  
    printf("%s\n", word);
    return 0;
}