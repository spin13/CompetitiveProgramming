#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include <math.h>
 
#define max(a, b) ((a) > (b) ? (a) : (b))
#define min(a, b) ((a) < (b) ? (a) : (b))
 
void swap(int *, int *);
 
int main(){
    char a[31];
    int i,n;
    scanf("%s", a);
    n=strlen(a);
 
    for(i=0;i<n;i++){
        if(a[i]=='a' || a[i]=='i' || a[i]=='u' || a[i]=='e' || a[i]=='o')continue;
        printf("%c", a[i]);
    }
    printf("\n");
 
    return 0;
}
 
 
void swap(int *a, int *b){ //swap(&a, &b);
    int t=*a;
    *a=*b;
    *b=t;
}
