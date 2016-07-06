import java.util.Scanner;
 
public class ARC011_A{
    static int m;
    static int n;
    static int N;
    static int l=0;
    static int ans=0;
    static int temp=0;
 
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        m=sc.nextInt();
        n=sc.nextInt();
        N=sc.nextInt();
 
        ans=N;
 
        while(true){
            N+=l;
            temp=N/m;
            l=N%m;
            N=temp*n;
            if(N==0)break;
            ans+=N;
        }
        System.out.println(ans);
    }
}