import java.util.Scanner;
public class ARC017_A {
    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args){
        boolean[] prime=primes(1000001);
        if(prime[sc.nextInt()])System.out.println("YES");
        else System.out.println("NO");
    }

    static boolean[] primes(int N){
        boolean[] primes=new boolean[N+1]; //Ç‹Ç≈ÇÃêî
        primes[1]=false;

        for(int i=2;i<=N;i++){
            primes[i]=true;
        }

        
        int i=2;
        while(i<=N){
            if(primes[i]==true){
                int s=i;
                s+=i;

                while(s<=N){
                    if(s>N)break;
                    primes[s]=false;
                    s+=i;
                }
            }
            i++;
        }
        return primes;
    }
}
