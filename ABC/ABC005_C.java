/*
 * Accepted
 */

import java.util.Arrays;
import java.util.Scanner;
public class ABC005_C {
    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args){
        int T=sc.nextInt();
        int N=sc.nextInt();
        int[] A=new int[N];
        for(int i=0;i<N;i++)A[i]=sc.nextInt();
        int M=sc.nextInt();
        int[] B=new int[M];
        for(int i=0;i<M;i++)B[i]=sc.nextInt();
        
        if(M>N){
            System.out.println("no");
            System.exit(0);
        }
        
        boolean f=true;
        int b=0;
        for(int i=0;i<M;i++){
            if(b>=N){
                f=false;
                break;
            }
            
            if(!(A[b]<=B[i] && B[i]<=A[b]+T)){
                i--;
            }
            b++;
        }
        
        System.out.println(f ? "yes" : "no");
    }

}
