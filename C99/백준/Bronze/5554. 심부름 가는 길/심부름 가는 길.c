#include <stdio.h>

int main()
{
    int y1, y2, y3, y4;
    
    int realX=0, realY=0;
    
    scanf("%d %d %d %d", &y1, &y2, &y3, &y4);
    
    realY = y1 + y2 + y3 + y4;
    
    while(realY >= 60) {
        realX += 1;
        realY -= 60;
    }
    printf("%d\n%d", realX, realY);
}