#include<stdio.h>

int main(){
    int a, b, c, hap, n, k;

    a = 1, b = 1, hap = 2;

    scanf( "%d", &n );

    for( int k = 3; k <= n; k++ ){

        c = a + b;

        hap += c;
        a = b;
        b = c;
    }

    printf(" hap = %d", hap );
}
