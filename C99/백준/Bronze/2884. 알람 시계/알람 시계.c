#include <stdio.h>

int main() {
    int H, M;
    
    scanf("%d %d", &H, &M);
    
    if (H <= 0 && M < 45) {
        H = 24;
    }
    
    if (M < 45) {
        H -= 1;
        M = 60 - (45 - M);
    } 
    else {
        //H -= 1;
        M = M - 45;
    }
    
    printf("%d %d", H, M);
}