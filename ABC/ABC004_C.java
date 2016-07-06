/*
 * Accepted
 */

import java.util.Scanner;
public class ABC004_C {
    static Scanner sc=new Scanner(System.in);
    
    public static void main(String[] args){
        int[] ans=new int[31];
        for(int i=0;i<31;i++){
            ans[i]=run(i);
        }
        
        System.out.println(ans[sc.nextInt()%30]);
        
    }
    static int run(int N){
        int[] a=new int[6];
        for(int i=0;i<a.length;i++)a[i]=i+1;
        int t1,t2;
        for(int i=0;i<N;i++){
            t1=i%5;
            t2=i%5+1;
            a[t1]^=a[t2];
            a[t2]^=a[t1];
            a[t1]^=a[t2];
        }
        String s="";
        for(int i=0;i<a.length;i++)s+=a[i];
        return Integer.parseInt(s);
    }
}
