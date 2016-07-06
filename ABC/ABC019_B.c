#include <stdio.h>
#include <stdlib.h>
#include <string.h>
 
#define MAX_SIZE 2000
 
int main(){
    char *str;
    int i,i2, N;
    char *ans;
    char *tmp;
    str=(char *)malloc(MAX_SIZE+1);
    ans=(char *)malloc(MAX_SIZE+26);
    tmp=(char *)malloc(10);
    strcpy(ans, "");
    scanf("%s", str);
    N=strlen(str);
    i2=0;
    
    for(i=0;i<N;i++){
        i2++;
        if(str[i]!=str[i+1] || i==N-1){
            sprintf(tmp, "%d", i2);
            ans[strlen(ans)]=str[i];
            strcat(ans, tmp);
            i2=0;
        }
    }
    
    puts(ans);
    free(ans);
    free(str);
    free(tmp);
    return 0;
}
