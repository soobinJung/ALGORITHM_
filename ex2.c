
#include<stdio.h>

int main(){

    int a[5];

    int *p;
    int i ;

    for( i = 0; i< 5; i++ ){
        a[i] = 10+i;
    }

    printf("i = %d\n", i);
    p = a;

    for( int j = 0; j<5; j++ ){
        printf("%d ", *p+j );
    }
}
