/*
 * Accepted
 */

import java.util.Scanner;

public class ARC033_A {
    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args){
        int ans=0;
        int N=sc.nextInt();
        for(int i=1;i<=N;i++)ans+=i;
        System.out.println(ans);
    }
}
