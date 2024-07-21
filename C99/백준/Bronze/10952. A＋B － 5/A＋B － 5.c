#include <stdio.h>

int main() {
    int A[100] = { 0 }, B[100] = { 0 };
    int cnt = 0;
    while (1) {
        scanf("%d %d", &A[cnt], &B[cnt]);
        if (A[cnt] == 0 && B[cnt] == 0) break;
        cnt++;
    }
    
    for (int i = 0; i < cnt; i++) {
        printf("%d\n", A[i] + B[i]);
    }
}