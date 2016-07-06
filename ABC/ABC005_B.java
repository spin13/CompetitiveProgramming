/*
 * Accepted
 */

import java.util.Scanner;
public class ABC005_B {
    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args){
        int N=sc.nextInt();
        int ans=10000;
        for(int i=0;i<N;i++)ans=Math.min(ans, sc.nextInt());
        System.out.println(ans);
    }

}
