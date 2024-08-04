#include <stdio.h>

int main()
{
    int L, P, M;
    int arr[5];
    
    scanf("%d %d", &L, &P);
    
    for (int i = 0; i < 5; i++) {
        scanf("%d", &arr[i]);
    }
    
    M = L * P;
    
    for (int i = 0; i < 5; i++) {
        arr[i] -= M;
    }
    
    for (int i = 0; i < 5; i++) {
        printf("%d ", arr[i]);
    }
}