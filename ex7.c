#include<stdio.h>

int main(){

    int n, c, k, y;
    int s[10];

    while( 1 ){

        scanf("%d", &n );

        if( n < 2 ){
            break;
        }

        c = -1;

        do{
            k = 2;
            while( n%k != 0 ){
                k++;
            }

            c++;

            s[c] = k;
            n /= k;

        }while( n != 1 );

        if( c == 1 ){
            printf("¼Ò¼ö\n");
        } else {

            for( y = 0; y <=c-1; y++ ){
                printf("%d X ", s[y]);
            }

            printf("%d", s[c]);
        }
    }
}
