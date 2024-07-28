#include <stdio.h>
#include <string.h>

int main()
{
    char alpha[100] = { "" };
    
    scanf("%s", alpha);
    
    int str_len = strlen(alpha);
    
    for (int i = 0; i < str_len; i++) {
        if (alpha[i] >= 'A' && alpha[i] <= 'Z')
        alpha[i] += 32;
        else if (alpha[i] >= 'a' && alpha[i] <= 'z')
        alpha[i] -= 32;
    }
    printf("%s", alpha);
}
