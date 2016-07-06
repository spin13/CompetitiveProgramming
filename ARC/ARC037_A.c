#include <stdio.h>
#include <stdlib.h>
#include <string.h>
 
int main(){
    int sum=0;
    int i;
    int N, t;
    scanf("%d", &N);
    for(i=0;i<N;i++){
            scanf("%d", &t);
            if(t<80)sum+=80-t;
    }
    printf("%d\n",sum);
    return 0;
}