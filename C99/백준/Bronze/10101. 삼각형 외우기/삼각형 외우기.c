#include <stdio.h>

int main()
{
    int a,b,c,asum;
    
    scanf("%d %d %d", &a, &b, &c);
    
    asum = a + b + c;
    
    if (a == 60 && b == 60 && c == 60)
        printf("Equilateral");
    else if (asum == 180 && a == b || b == c || c == a)
        printf("Isosceles");
    else if (asum == 180 && a != b && b != c && c != a)
        printf("Scalene");
    else 
        printf("Error");
}