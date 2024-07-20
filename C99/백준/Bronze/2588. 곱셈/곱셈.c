#include <stdio.h>

int main() {
    int M1, M2;
    
    scanf("%d %d", &M1, &M2);
    printf("%d\n", M1 * (M2 % 10));
    printf("%d\n", M1 * ((M2 % 100) / 10));
    printf("%d\n", M1 * (M2 / 100));
    printf("%d", M1 * M2);
}