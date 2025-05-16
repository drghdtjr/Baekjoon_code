#include<stdio.h>
int main(void) {
    int n, x, k;
    scanf("%d %d", &n, &x);
    for (int i = 0; i < n; i++) {
        scanf("%d", &k);
        if (x > k)
            printf("%d ", k);
    }
}