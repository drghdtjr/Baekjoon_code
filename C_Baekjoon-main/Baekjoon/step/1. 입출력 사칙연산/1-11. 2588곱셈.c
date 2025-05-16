#include<stdio.h>
int main(void) {
    int a, b;
    int d, e, f;
    scanf( "%d", &a);
    scanf("%d", &b);
    d = a * ((b % 100) % 10);
    e = (a * ((b % 100) / 10));
    f = (a * (b / 100));
    printf("%d\n", d);
    printf("%d\n", e);
    printf("%d\n", f);
    printf("%d\n" ,d+(e*10)+(f*100));
}