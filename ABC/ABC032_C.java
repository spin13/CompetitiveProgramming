import java.util.Scanner;
import java.util.Collections;
import java.util.Arrays;
import java.util.ArrayList;
import java.math.BigInteger;
public class ABC032_C {
    static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int N=sc.nextInt();
        int k=sc.nextInt();
        int ans=0;
        int now=1;
        
        BigInteger K=new BigInteger(String.valueOf(k));
        
        int[] S=new int[N];
        for(int i=0;i<N;i++)S[i]=sc.nextInt();
        BigInteger sum=new BigInteger(String.valueOf(S[0]));
        
        if(S[0]==0){
            System.out.println(N);
            System.exit(0);
        }
        
        for(int i=1;i<N;i++){
            if(S[i]==0){
                System.out.println(N);
                System.exit(0);
            }
            sum=sum.multiply( new BigInteger(String.valueOf(S[i])));
            now++;
            if((sum.compareTo(K)) == 1){
                sum=sum.divide(new BigInteger(String.valueOf(S[i-now+1])));
                now--;
            }else{
                ans=Math.max(ans, now);
            }
        }
        
        if(ans==0 && S[0]<=k){
            System.out.println(1);
        }else{
            System.out.println(ans);
        }
    }
    static int SI(String a) {
        return Integer.parseInt(a);
    }
    static char SC(String a) {
        return a.charAt(0);
    }
    static double SD(String a) {
        return new Double(a).doubleValue();
    }
    static String CS(char a) {
        return String.valueOf(a);
    }
    static int DI(double a) {
        return new Double(a).intValue();
    }
    static String DS(double a) {
        return Double.toString(a);
    }
    static int LI(long a) {
        return new Long(a).intValue();
    }
    static char LC(long a) {
        return Long.toString(a).charAt(0);
    }
    static double LD(long a) {
        return new Long(a).doubleValue();
    }
    static long IL(int a) {
        return new Integer(a).longValue();
    }
    static double ID(int a) {
        return new Integer(a).doubleValue();
    }
    static char IC(int a) {
        return Integer.toString(a).charAt(0);
    }
    static String IS(int a) {
        return Integer.toString(a);
    }

}