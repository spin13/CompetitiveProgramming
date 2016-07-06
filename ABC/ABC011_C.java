/*
 * Accepted
 */

import java.util.Scanner;
import java.util.Collections;
import java.util.Arrays;
import java.util.ArrayList;

public class ABC011_C {
    static final Scanner sc = new Scanner(System.in);
    static final int INF=(int)10e9;
    public static void main(String[] args) {
        int[] dp=new int[301];
        int N=sc.nextInt();
        Arrays.fill(dp, INF);
        dp[N]=0;
        boolean[] NG=new boolean[301];
        for(int i=0;i<3;i++)NG[sc.nextInt()]=true;
        if(NG[N]){
            System.out.println("NO");
            System.exit(0);
        }
        
        for(int i=0;i<299;i++){
            if(NG[i] && NG[i+1] && NG[i+2] && N>i+2){
                System.out.println("NO");
                System.exit(0);
            }
        }
        
        
        for(int i=N;i>=0;i--){
            if(NG[i])continue;
            for(int i2=1;i2<=3;i2++){
                if(i-i2 < 0)continue;
                dp[i-i2]=Math.min(dp[i]+1, dp[i-i2]);
            }   
        }
        System.out.println(dp[0]<=100 ? "YES" : "NO");
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