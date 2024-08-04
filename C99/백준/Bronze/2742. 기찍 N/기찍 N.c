#include <stdio.h>
#include <string.h>

int main()
{
    int s;
    
    scanf("%d", &s);
    
    for (int i = s; i > 0; i--) {
        printf("%d\n", i);
    }
    
}