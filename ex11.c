#include <stdio.h>

int main(){

    recursive(5);

}
int recursive( int n ){

    int i;

    if( n < 1 ){

        return 2;

    }else{

        i = (2 * recursive(n-1) ) + 1;
        printf("%d\n", i );
        return i;
    }
}
