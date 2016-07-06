#include <stdio.h>
#include <stdlib.h>
#include <string.h>
void reverse(char *str){
    int i,n;
    char c;
    n=strlen(str);
    for(i=0;i<n/2;i++){
        c=str[i];
        str[i]=str[n-i-1];
        str[n-i-1]=c;
    }
}
 
int main(){
    char *str;
    int i;
    int N, M;
    int center;
    int flag=1;
    str=(char *)malloc(1001);
    scanf("%s", str);
    N=strlen(str);
    if(N%2==0)center=N/2;
    else center=N/2+1;
 
    char *s1=str+center;
    M=N-center;
    reverse(s1);
    
    for(i=0;i<M;i++){
        if( (str[i]!='*' && s1[i]!='*')
            && str[i]!=s1[i])flag=0;
    }
 
    printf(flag ? "YES\n" : "NO\n");
    free(str);
    return 0;
}