
#include<stdio.h>

int main(){

    int n = 0;

    srand(time(NULL));

    while( n != 1 ){

        n =  rand() % 6 + 1 ;
        printf("%d\n", n);
    }
}
