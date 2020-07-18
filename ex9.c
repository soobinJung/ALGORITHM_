#include<stdio.h>
// mavangjin

int main(){

    int i, j, k, nmg;
    int a[5][5];

    i = 0;
    j = 5/2;

    for( k=1; k<=25; k++ ){

        a[i][j] = k;
        // 나머지가 0이야?
        nmg = k-k/5*5;

        if( nmg == 0 ){

            i++;
            continue;
        }
        //행 감소
        i--;
        // 열 증가
        j++;

        if( i < 0 )
            i = 4;

        if( j > 4 )
            j = 0;
    }

    for( int x = 0; x <= 4; x++ ){
       for( int y = 0; y <= 4; y++ ){

             printf("|%3d|", a[x][y]);
       }
       printf("\n");

    }
}
