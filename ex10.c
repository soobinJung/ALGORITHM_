#include<stdio.h>
#include<string.h>

main(){

    FILE *inf;
    inf = fopen("data.txt","r");
    char n[10];
    int pm[10], tm[10], p, t, m, sw, k;

    printf("출장비지급");

    for( k = 0; k < 10; k++ ){
        tm[k] = pm[k] = 0;
    }

    while( 1 ){

        fscanf(inf, "%s %d", n, &p);

        if( strcmp( n ,"quit" ) == 0 ){
            break;
        }

        t = p;
        m = 50000;
        sw = 1;

        for( k=0; k<10; k++ ){

            pm[k] = t/m;

            t = t-(pm[k]*m);

            if( sw == 1 ){

                m /= 5;
                sw = 0;

            }else{

                m /= 2;
                sw = 1;

            }
        }

        printf("%s %d", n, p );

        for( k = 0; k < 10; k++ ){
            printf("%5d", pm[k]);
            tm[k] += pm[k];
        }

        printf("\n");
    }
}
