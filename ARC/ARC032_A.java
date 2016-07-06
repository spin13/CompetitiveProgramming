import java.util.Scanner;

public class ARC032_A {
    static Scanner sc=new Scanner(System.in);
    static boolean[] sieve(int n){
        boolean[] si=new boolean[n];
        for(int i=2;i<n;i++)si[i]=true;
        for(int i=2;i<n;i++){
            if(si[i]){
                for(int i2=i+i;i2<n;i2+=i)si[i2]=false;
            }
        }
        return si;
    }
    
    public static void main(String[] args){
        boolean[] prime=sieve(600000);
        int N=sc.nextInt();
        int sum=0;
        for(int i=1;i<=N;i++)sum+=i;
        System.out.println(prime[sum] ? "WANWAN" : "BOWWOW");
    }
}
