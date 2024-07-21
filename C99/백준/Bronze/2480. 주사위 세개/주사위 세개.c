#include <stdio.h>

int main() {
    int A, B, C;
    
    int max = 0, min = 100;
    
    scanf("%d %d %d", &A, &B, &C);
    int arr[3] = { A, B, C };
    
    for (int i = 0; i < 3; i++) {
        if (arr[i] < min) min = arr[i];
        if (arr[i] > max) max = arr[i];
    }
    
    if (A == B && B == C) {
        printf("%d", 10000 + (A * 1000));
    } else if (A == B || B == C || A == C) {
        int same = (A == B) ? A : ((B == C) ? B : A);  // 같은 숫자 찾기
        printf("%d", 1000 + (same * 100));
    } else {
        printf("%d", max * 100);
    }
}