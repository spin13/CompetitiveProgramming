#include <stdio.h>
#include <stdlib.h>
#include <string.h>
 
int main(){
    char *a, *b;
    a=(char *)malloc(10);
    b=(char *)malloc(10);
    scanf("%s%s", a,b);
    a=strcat(a,b);
    int c=atoi(a);
    printf("%d\n", c*2);
    free(a);
    free(b);
    return 0;
}
