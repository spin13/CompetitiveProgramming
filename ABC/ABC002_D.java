/*
 * Accepted
 */

import java.util.Scanner;
import java.util.ArrayList;
public class ABC002_D {
    static Scanner sc=new Scanner(System.in);
    static boolean[][] known;
    static int N;
    static int ans=1;
    public static void main(String[] args){
        
        N=sc.nextInt();
        
        int M=sc.nextInt();
        known=new boolean[N+1][N+1];



        for(int i=0;i<M;i++){
            int a=sc.nextInt(), b=sc.nextInt();
            known[a][b]=true;
            known[b][a]=true;
        }
        
        
        int ncr=comb(N);
        int a=1;
        String t;
        ArrayList<Integer> list=new ArrayList<Integer>();
        for(int i=3;i<=ncr;i++){
            list.clear();
            a=1;
            t=Integer.toBinaryString(i);
            if(t.toString().length()<N)t=plusz(t);
            //System.out.println(t);
            
            //String list="";
            for(int i2=0;i2<N;i2++){
                if(t.charAt(i2)=='1')list.add(i2);
            }

            boolean flag=true;
            for(int i2=0;i2<list.size();i2++){
                int t1, t2;
                for(int i3=i2+1;i3<list.size();i3++){
                    t1=list.get(i2)+1;
                    t2=list.get(i3)+1;
                    if(!known[t1][t2])flag=false;
                    //System.out.println(t1+" "+t2);
                }
            }
            if(flag)a=list.size();
            ans=Math.max(ans, a);
        }
        System.out.println(ans);
        
    }

    static String plusz(String s){
        String a="";
        for(int i=0;i<N-s.length();i++)a+="0";
        return a+s;
    }
    
    static int comb(int N){
        int ncr=0;
        for(int i=1;i<=N;i++){
            int a=N;
            for(int i2=1;i2<i;i2++)a*=(N-i2);
            a/=fact(i);
            ncr+=a;
        }
        return ncr;
    }
    
    static int fact(int n){
        if(n==1)return 1;
        return n*fact(n-1);
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
