
#include<stdio.h>

struct sawon{

    char name[10];
    char jikwi[10];
    int pay;

};

struct sawon data;

int main(){
    printf("이름 >>> "); scanf("%s", data.name );
    printf("직위 >>> "); scanf("%s", data.jikwi );
    printf("급여 >>> "); scanf("%d", &data.pay );

    printf("이름 >>> %s \n", data.name );
    printf("직위 >>> %s \n", data.jikwi);
    printf("급여 >>> %d \n", data.pay  );
}

