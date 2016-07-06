/*
 * Accepted
 */

import java.util.Scanner;

public class ABC009_B {
    static Scanner sc=new Scanner(System.in);
    
    public static void main(String[] args){
        int N=sc.nextInt();
        int[] p=new int[N];
        for(int i=0;i<N;i++)p[i]=sc.nextInt();
        
        java.util.Arrays.sort(p);
        int max=p[p.length-1];
        for(int i=p.length-1;i>=0;i--){
            if(max!=p[i]){
                System.out.println(p[i]);
                break;
            }
        }
    }
}
