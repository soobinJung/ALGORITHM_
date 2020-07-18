#include<stdio.h>

int main(){

    int n, i, j, tm, flag;

    int a[5] = { 4, 5, 1, 2, 3 };

    n = 4;
    i = -1;

    do{
        flag = 0;
        i++;
        j = -1;

        do{

           j++;

           if( a[j] > a[j+1] ){

                tm = a[j];
                a[j] = a[j+1];
                a[j+1] = tm;

                flag = 1;
           }
        } while( j <= n -(i+1) );

        if( i >= n-1 )
            break;

    }while( flag == 1 );

    for( int x=0; x<=4; x++ ){
        printf("%d", a[x]);
    }
}
