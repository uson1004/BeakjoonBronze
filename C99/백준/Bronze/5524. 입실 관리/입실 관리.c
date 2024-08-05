#include <stdio.h>
#include <string.h>
#include <ctype.h>

int main()
{
    
    int s;
    scanf("%d", &s);
    
    char str[100][100] = { "" };
    
    for (int i = 0; i < s; i++) {
        scanf("%s", str[i]);
    }

    for (int i = 0; i < s; i++) {
        for (int j = 0; str[i][j] != '\0'; j++) {
            if (str[i][j] >= 'A' && str[i][j] <= 'Z') {
                str[i][j] = str[i][j] + 32;
            }
        }
    }
    
    for (int i = 0; i < s; i++) {
        printf("%s\n", str[i]);
    }
    
}