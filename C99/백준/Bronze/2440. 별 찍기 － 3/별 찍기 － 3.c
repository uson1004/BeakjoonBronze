#include <stdio.h>

int main()
{
    int N = 0;
    
    scanf("%d", &N);
    
    for(int i = 0; i < N; i++) {
        for (int j = 0; j < N - i; j++) {
            printf("*");
        }
        printf("\n");
    }
}