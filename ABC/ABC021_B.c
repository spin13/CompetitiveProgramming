#include <stdio.h>
#include <stdlib.h>
#include <string.h>
 
const int check(const int[], const int, const int);
 
int main(){
    int N, start, goal, K, i;
    int a[102]={0};
    int flag=1;
    int tmp;
    scanf("%d%d%d%d", &N, &start, &goal, &K);
    a[0]=start;
    for(i=1;i<=K;i++){
        scanf("%d", &tmp);
        if(check(a, K, tmp) != 0){
            flag=0;
        }
        a[i]=tmp;
    }
    if(check(a, K, goal) != 0){
        flag=0;
    }
    printf(flag ? "YES\n": "NO\n");
    
    return 0;
}
     
const int check(const int a[], const int K, const int tmp){
    int i;
    for(i=0;i<K;i++){
        if(a[i]==tmp)return -1;
    }
    return 0;
}
