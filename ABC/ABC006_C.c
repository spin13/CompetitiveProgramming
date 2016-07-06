#include <stdio.h>
#include <stdlib.h>
#include <string.h>
 
 
#define max(a, b) ((a) > (b) ? (a) : (b))
#define min(a, b) ((a) < (b) ? (a) : (b))
#define FOR(i,a,b) for(i=(a);i<(b);i++)
#define rep(i,n) for(i=0;i<=(n);i++)
#define lli long long int
#define ulli unsigned long long int
 
int abs(int x);
 
int main(){
    int N,M,i,i2,i3;
    //printf("%d\n",2*0);
    scanf("%d%d", &N, &M);
    int l=M/2;
    int sum;
    int lim=100000;
    int a,b,c;
 
    int t=0;
    rep(i,N){
        b=i;
        t=2*N;
        t=abs(M-t);
        c=t/2;
        a=N-c-b;
        if(a<0 || b<0 || c<0)continue;
        if(((a*2)+(b*3)+(c*4))==M){
            //printf("%d\n",((a*2)+(b+3)+(c*4)));
            printf("%d %d %d\n", a,b,c);
            exit(0);
        }
    }
/*
    if(N>=1600){
        puts("NA");
        return 0;
    }
    
    rep(i,lim-1){
        //printf("%d\n", i);
        a[i]=2*i;
        b[i]=3*i;
        c[i]=4*i;
    }
    //printf("%d\n",a[100]+b[0]+c[0]);
    rep(i,N){
        rep(i2,N){
            if(a[i]+b[i2]+c[N-i-i2]==M){
                printf("%d %d %d\n", i,i2,N-i-i2);
                exit(0);
            }
        }
    }
    */
    puts("-1 -1 -1");
 
 
 
    return 0;
}