import java.util.Scanner;

public class Domestic2008_A{
    static final Scanner sc=new Scanner(System.in);
    
    public static void main(String[] args){
        while(true){
            int n=sc.nextInt();
            int m=sc.nextInt();
            if(n==0 && m==0)break;
            int[] taro=new int[n];
            int[] hana=new int[m];
            boolean flag=false;
            int[] ans=new int[2];
            
            for(int i=0;i<n;i++)taro[i]=sc.nextInt();
            for(int i=0;i<m;i++)hana[i]=sc.nextInt();
            
            for(int i=0;i<n;i++){
                for(int i2=0;i2<m;i2++){
                    int[] ttaro=taro.clone();
                    int[] thana=hana.clone();
                    int tmp=ttaro[i];
                    ttaro[i]=thana[i2];
                    thana[i2]=tmp;
                    
                    if(total(ttaro) == total(thana)){
                        if(!flag){
                            ans[0]=taro[i];
                            ans[1]=hana[i2];
                        }else{
                            if(ans[0]+ans[1] > taro[i]+hana[i2]){
                                ans[0]=taro[i];
                                ans[1]=hana[i2];
                            }
                        }
                        flag=true;
                    }
                }
            }
            if(flag){
                System.out.println(ans[0]+" "+ans[1]);
            }else{
                System.out.println(-1);
            }
        }
    }
    
    static int total(int[] a){//sum
        int sum=0;
        for(int i=0;i<a.length;i++)sum+=a[i];
        return sum;
    }
}