#include <stdio.h>
#include <string.h>
#include <stdlib.h>
#include <math.h>
 
#define MAX(a, b) ((a) > (b) ? (a) : (b))
 
const double cs=110.0/900.0;
 
int main(){
    int i, i2, N;
    //double sum[5]={0};
    double a;
    double sum=0.0;
    double ans=0.0;
    scanf("%d", &N);
    for(i=0;i<N;i++){
        for(i2=0;i2<5;i2++){
            scanf("%lf", &a);
            if(i2==4)continue;
            sum+=a;
            //printf("%lf\n", a);
        }
        //printf("%lf\n", sum);
        sum+=(a*cs);
        ans=MAX(ans, sum);
        sum=0.0;
    }
 
    printf("%lf\n", ans);
    
    
    return 0;
}