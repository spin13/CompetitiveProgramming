/*
 * Accepted
 */
import java.util.Scanner;
import java.util.Collections;
import java.util.Arrays;
import java.util.ArrayList;
public class ABC038_C {
    static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        
        final int N=sc.nextInt();
        int cn=N;
        long a, b;
        int cnt=1;
        long sum=0;
        
        a=sc.nextLong();
        for(int i=1;i<N;i++){
            b=sc.nextLong();
            
            if(a<b){
                cnt++;
            
            }else if(cnt<=1){
            }else{
                cn-=cnt;
                sum+=(perm(cnt+1, 2)/perm(2,2));
                cnt=1;
            }
            a=b;
        }

        if(2<=cnt){
            cn-=cnt;
            sum+=(perm(cnt+1, 2)/perm(2,2));
        }
        System.out.println(sum+cn);
        
        a=100000;
        b=2;
        //System.out.println(perm(a, b)/perm(b,b));
    }
    
    static long perm(long a, long b){
        long ret=1;
        for(int i=0;i<b;i++){
            ret*=(a-i);
        }
        return ret;
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