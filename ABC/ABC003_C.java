/*
 * Accepted
 */

import java.util.Scanner;
public class ABC003_C {
    static Scanner sc=new Scanner(System.in);
    
    public static void main(String[] args){
        int n=sc.nextInt();
        int k=sc.nextInt();
        int[] rate=new int[n];
        for(int i=0;i<n;i++)rate[i]=sc.nextInt();
        java.util.Arrays.sort(rate);
        double score=0.0;
        for(int i=0;i<k;i++){
            score=(score+rate[n-k+i])/2.0;
        }
        System.out.println(score);
    }
}
