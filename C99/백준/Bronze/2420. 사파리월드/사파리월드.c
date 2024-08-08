#include <stdio.h>

int main()
{
    long long int A, B, s;
    
    scanf("%lld %lld", &A, &B);
    
    s = B-A;
    
    if (s <= 0)
        s *= -1;
            
    printf("%lld", s);
}
