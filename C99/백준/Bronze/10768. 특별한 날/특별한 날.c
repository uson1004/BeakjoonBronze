#include <stdio.h>

int main()
{
    int month, day;
    
    scanf("%d %d", &month, &day);
    
    if (month < 2)
        printf("Before");
    else if (month == 2) {
        if (day < 18)
            printf("Before");
        else if (day > 18)
            printf("After");
        else
            printf("Special");
    }
    else
        printf("After");
}