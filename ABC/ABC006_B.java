/*
 * Accepted
 */

import java.util.Scanner;
public class ABC006_B {
    static Scanner sc=new Scanner(System.in);
    static int cons=10007;
    public static void main(String[] args){
        int N=sc.nextInt();
        int[] a=new int[1000001];
        a[1]=0;a[2]=0;a[3]=1;
        for(int i=4;i<=N;i++)a[i]=(a[i-1]%cons)+(a[i-2]%cons)+(a[i-3]%cons);
        System.out.println(a[N]%cons);
    }
}
